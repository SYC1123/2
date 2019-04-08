package com.example;

public class My_function {
    private String name;
    private int imageId;
    public My_function(String name ,int imageId)
    {
        this.imageId=imageId;
        this.name=name;

    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }
}
