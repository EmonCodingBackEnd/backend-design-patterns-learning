package com.coding.design.patterns.behavioral.p14iterator.example1;

public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Java设计模式精讲");
        Course course4 = new Course("Python课程");
        Course course5 = new Course("算法课程");
        Course course6 = new Course("前端课程");

        CourseAggregate aggregate = new CourseAggregateImpl();
        aggregate.addCourse(course1);
        aggregate.addCourse(course2);
        aggregate.addCourse(course3);
        aggregate.addCourse(course4);
        aggregate.addCourse(course5);
        aggregate.addCourse(course6);

        System.out.println("-----课程列表-----");
        printCourses(aggregate);

        aggregate.removeCourse(course4);
        aggregate.removeCourse(course5);
        System.out.println("-----删除操作执行之后的课程列表-----");
        printCourses(aggregate);
    }

    private static void printCourses(CourseAggregate aggregate) {
        CourseIterator courseInterator = aggregate.getCourseInterator();
        while (!courseInterator.isLastCourse()) {
            Course course = courseInterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
