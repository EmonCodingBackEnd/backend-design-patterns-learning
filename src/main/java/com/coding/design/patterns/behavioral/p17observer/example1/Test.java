package com.coding.design.patterns.behavioral.p17observer.example1;

public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher = new Teacher("Alpha");
        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("lm");
        question.setQuestionContent("Java的主函数如何编写");
        course.producerQuestion(course, question);
    }
}
