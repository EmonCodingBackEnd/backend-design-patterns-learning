package com.coding.design.patterns.behavioral.p19command.example1;

public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲  -- By Geely");
        OpenCourseVideoCommand openCmd = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCmd = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCmd);
        staff.addCommand(closeCmd);

        staff.executeCommands();

    }
}
