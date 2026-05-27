package com.example.lostandfoundapp;

public class Advert {

    private int id;
    private String type;
    private String name;
    private String phone;
    private String description;
    private String location;
    private String category;
    private String image;
    private String timestamp;

    public Advert(int id, String type, String name, String phone, String description,
                  String location, String category, String image, String timestamp) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.phone = phone;
        this.description = description;
        this.location = location;
        this.category = category;
        this.image = image;
        this.timestamp = timestamp;
    }

    public int getId() { return id; }
    public String getType() { return type; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }
    public String getCategory() { return category; }
    public String getImage() { return image; }
    public String getTimestamp() { return timestamp; }
}