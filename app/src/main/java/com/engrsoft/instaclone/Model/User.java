package com.engrsoft.instaclone.Model;

public class User {
    public String id;
    public String username;
    public String fullName;
    public String bio;
    public String imageURL;

    public User(String id, String username, String fullName, String bio, String imageURL) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.bio = bio;
        this.imageURL = imageURL;
    }

    public User() {
    }
    public void setImageURL(String imageURL){this.imageURL = imageURL;}
    public String getImageURL(){
        return imageURL;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
