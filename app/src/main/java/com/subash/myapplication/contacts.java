package com.subash.myapplication;


public class contacts {

    private String name;
    private String phoneNo;
    private int imageId;

    public contacts(String name, String phoneNo,int imageId){
        this.name = name;
        this.phoneNo = phoneNo;
        this.imageId = imageId;
    }

    public String getName()
    {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getPhoneNo() {

        return phoneNo;
    }
}
