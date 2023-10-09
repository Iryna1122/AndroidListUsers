package com.example.androidlistusers;

public class UserModel {
    private int avatarResourceId;
    private String firstName;
    private String lastName;
    private long ageUtc;
    private String country;
    private String city;

    public UserModel(int avatarResourceId, String firstName, String lastName, long ageUtc, String country, String city) {
        this.avatarResourceId = avatarResourceId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageUtc = ageUtc;
        this.country = country;
        this.city = city;
    }

    public int getAvatarResourceId() {
        return avatarResourceId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAgeUtc() {
        return ageUtc;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
