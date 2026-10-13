package ru.ranepa;

import java.util.List;

public class Student {
    String name;
    int course;
    List<Integer> marks;

    public Student(String name, int course, List<Integer> marks) {
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public double averageMarks() {
        if (marks == null || marks.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.size();
    }

    public String getStatus() {
        double avg = averageMarks();
        if (avg >= 4.5) return "excellent";
        if (avg >= 3.5) return "good";
        if (avg >= 2.5) return "average";
        return "poor";
    }

    public void printReport() {
        System.out.println("Student: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Average mark: " + averageMarks());
        System.out.println("Status: " + getStatus());
    }
}
