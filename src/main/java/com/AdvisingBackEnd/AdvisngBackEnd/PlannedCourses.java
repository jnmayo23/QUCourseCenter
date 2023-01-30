package com.AdvisingBackEnd.AdvisngBackEnd;

public class PlannedCourses {
    private int userID;
    private String coursecode;
    private String semester;
    private int grade;

    //Getters and Setters

    //User ID
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }

    //Course Code
    public String getCoursecode() {
        return coursecode;
    }
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    //Semester
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    //Grade
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
