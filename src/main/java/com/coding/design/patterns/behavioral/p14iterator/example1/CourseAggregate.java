package com.coding.design.patterns.behavioral.p14iterator.example1;

public  interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseInterator();
}
