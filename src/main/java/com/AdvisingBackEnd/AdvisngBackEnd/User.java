package com.AdvisingBackEnd.AdvisngBackEnd;

public class User {
    private int userID;
    private String name;
    private String username;
    private String Password;
    private int usertype;
    private int credits;
    private  String major;
    private String minor;
    private float gpa;
    private int advisorID;

    //Getters and Setters for all variables

    //UserID
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }

    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //UserName
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    //Password
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }

    //UserType
    public int getUsertype() {
        return usertype;
    }
    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    //Credits
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //major
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    //Minor
    public String getMinor() {
        return minor;
    }
    public void setMinor(String minor) {
        this.minor = minor;
    }

    //GPA
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    //advisorID
    public int getAdvisorID() {
        return advisorID;
    }
    public void setAdvisorID(int advisorID) {
        this.advisorID = advisorID;
    }
}
