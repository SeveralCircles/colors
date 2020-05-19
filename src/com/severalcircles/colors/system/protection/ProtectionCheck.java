package com.severalcircles.colors.system.protection;

import java.net.URISyntaxException;

public abstract class ProtectionCheck {
    public static void runChecks() throws URISyntaxException, ProtectionCheckFailException {
        if (!new BuildExpiry().checkPass()) {
            throw new ProtectionCheckFailException(new BuildExpiry());
        }
    }

    abstract boolean checkPass() throws URISyntaxException;
}
