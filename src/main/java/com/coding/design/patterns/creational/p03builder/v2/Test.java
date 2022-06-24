package com.coding.design.patterns.creational.p03builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course =
                new Course.CourseBuilder()
                        .buildCourseName("Java设计模式精讲")
                        .buildCoursePPT("Java设计模式精讲PPT")
                        .buildCourseVideo("Java设计模式精讲视频")
                        .buildCourseArticle("Java设计模式精讲手记")
                        .buildCourseQA("Java设计模式精讲问答")
                        .build();

        System.out.println(course);
    }
}
