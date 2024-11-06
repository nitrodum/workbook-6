package com.pluralsight;

import java.util.Comparator;

public class Course implements Comparable {
    private String title;
    private int studyPoints;
    private int maxStudents;

    public Course(String title, int studyPoints, int maxStudents) {
        this.title = title;
        this.studyPoints = studyPoints;
        this.maxStudents = maxStudents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Course c) {
            return this.title.compareTo(c.getTitle());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + " School Points: " + this.studyPoints + " Max Students: " + this.maxStudents;
    }
}
