package com.AdvisingBackEnd.AdvisngBackEnd;

public class Courses {
    private String coursecode;
    private String section;
    private String offsemester;
    private String coursename;
    private String porfessor;
    private String description;
    private String prereq;
    private String days;
    private int time;

    //getters and setters

    //CourseCode
    public String getCoursecode() {
        return coursecode;
    }
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    //Section
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }

    //Offered Semester
    public String getOffsemester() {
        return offsemester;
    }
    public void setOffsemester(String offsemester) {
        this.offsemester = offsemester;
    }

    //Course Name
    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    //Professor
    public String getPorfessor() {
        return porfessor;
    }
    public void setPorfessor(String porfessor) {
        this.porfessor = porfessor;
    }

    //Description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //Pre Reqs
    public String getPrereq() {
        return prereq;
    }
    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }

    //Days
    public String getDays() {
        return days;
    }
    public void setDays(String days) {
        this.days = days;
    }

    //Time
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
}
