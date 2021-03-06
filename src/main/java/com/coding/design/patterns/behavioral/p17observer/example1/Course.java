package com.coding.design.patterns.behavioral.p17observer.example1;

import java.util.Observable;

public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void producerQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
