package com.example;

public class UserTalk {
    private String name;
    private int Imageid;
    public UserTalk(String name, int Imageid)
    {
        this.Imageid=Imageid;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getImageid() {
        return Imageid;
    }
}
