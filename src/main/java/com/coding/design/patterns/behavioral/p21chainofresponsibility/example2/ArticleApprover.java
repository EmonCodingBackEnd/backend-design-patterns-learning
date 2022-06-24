package com.coding.design.patterns.behavioral.p21chainofresponsibility.example2;

import org.springframework.util.StringUtils;

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!StringUtils.isEmpty(course.getArticle())) {
            System.out.println(course.getName() + " 含有手记，批准！");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + " 不含有手记，不批准，流程结束！");
        }
    }
}
