package com.example.demo10;

import java.io.Serializable;
import java.util.Arrays;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String hear;
    private String[] announcements;
    private String contact;

    public User() {}

    public User(String firstName, String lastName, String email, String dob,
                String hear, String[] announcements, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.hear = hear;
        this.announcements = announcements;
        this.contact = contact;
    }

    // Getters & Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getHear() { return hear; }
    public void setHear(String hear) { this.hear = hear; }

    public String[] getAnnouncements() { return announcements; }
    public void setAnnouncements(String[] announcements) { this.announcements = announcements; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getAnnouncementsAsString() {
        if (announcements == null || announcements.length == 0) {
            return "None";
        }
        return String.join(", ", announcements);
    }

}
