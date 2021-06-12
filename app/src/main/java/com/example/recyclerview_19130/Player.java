package com.example.recyclerview_19130;

public class Player {
    String Name , Club ;
    int ShirtNumber;

    public Player() {
    }

    public Player(String name, String club, int shirtNumber) {
        Name = name;
        Club = club;
        ShirtNumber = shirtNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClub() {
        return Club;
    }

    public void setClub(String club) {
        Club = club;
    }
}
