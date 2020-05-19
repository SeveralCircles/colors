package com.severalcircles.colors.commands;

import org.bukkit.entity.Player;

public class Message {
    Player sender;
    Player target;
    String message;
    MessageStatus status;

    public Message(Player sender, Player target, String message) {
        this.sender = sender;
        this.target = target;
        this.message = message;
        this.status = MessageStatus.QUEUED;
    }

    public Player getSender() {
        return sender;
    }

    public void setSender(Player sender) {
        this.sender = sender;
    }

    public Player getTarget() {
        return target;
    }

    public void setTarget(Player target) {
        this.target = target;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }
}
