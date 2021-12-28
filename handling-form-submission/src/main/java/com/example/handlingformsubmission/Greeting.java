package com.example.handlingformsubmission;

public class Greeting {

    private long fromID;
    private long toID;
    private String content;

    public long getToID() {
        return toID;
    }

    public void setToID(long toID) {
        this.toID = toID;
    }

    public long getFromID(){
        return fromID;
    }

    public void setFromID(long fromID){
        this.fromID = fromID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}