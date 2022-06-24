package com.coding.design.principle.p1openclose;

public class Test {

    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) javaCourse;
        System.out.println(
                "课程ID:"
                        + javaCourse.getId()
                        + ",课程名称"
                        + javaCourse.getName()
                        + ",课程原价"
                        + javaDiscountCourse.getOriginPrice()
                        + ",课程价格"
                        + javaCourse.getPrice());
    }
}
