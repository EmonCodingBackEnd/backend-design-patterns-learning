package com.coding.design.patterns.behavioral.p14iterator.example1;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseInterator() {
        return new CourseIteratorImpl(courseList);
    }
}
