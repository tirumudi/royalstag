package com.exavirtue.labs.models;

/**
 * Created by thirumudi on 6/10/17.
 */
public class Player extends User {

    private int rating;
    private String skills;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
