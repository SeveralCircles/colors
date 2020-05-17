package com.severalcircles.colors.system.protection;

//import java.sql.Time;
//
//import static org.graalvm.compiler.debug.DebugOptions.Time;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;

public class BuildExpiry extends ProtectionCheck {
    private final Date date = new Date();
    private final long time = date.getTime();
    private final long month = 2592 * 1000000; // Because java is really dumb about defining longs

    @Override
    boolean checkPass() throws URISyntaxException {
        return classBuildTimeMillis() - time < month;
    }

    private long classBuildTimeMillis() throws URISyntaxException, IllegalStateException, IllegalArgumentException {
        URL resource = getClass().getResource(getClass().getSimpleName() + ".class");
        if (resource == null) {
            throw new IllegalStateException("Failed to find class file for class: " +
                    getClass().getName());
        }

        if (resource.getProtocol().equals("file")) {

            return new File(resource.toURI()).lastModified();

        } else if (resource.getProtocol().equals("jar")) {

            String path = resource.getPath();
            return new File(path.substring(5, path.indexOf("!"))).lastModified();

        } else {

            throw new IllegalArgumentException("Unhandled url protocol: " +
                    resource.getProtocol() + " for class: " +
                    getClass().getName() + " resource: " + resource.toString());
        }
    }
}
