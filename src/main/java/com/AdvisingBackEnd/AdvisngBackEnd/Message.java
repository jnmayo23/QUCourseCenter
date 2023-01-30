package com.AdvisingBackEnd.AdvisngBackEnd;

public class Message {
    private int messageID;
    private int senderID;
    private int recieverID;
    private String message;

    //getters and setters for all variables

    //messageID
    public int getMessageID() {
        return messageID;
    }
    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    //senderID
    public int getSenderID() {
        return senderID;
    }
    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    //RecieverID
    public int getRecieverID() {
        return recieverID;
    }
    public void setRecieverID(int recieverID) {
        this.recieverID = recieverID;
    }

    //Message
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
