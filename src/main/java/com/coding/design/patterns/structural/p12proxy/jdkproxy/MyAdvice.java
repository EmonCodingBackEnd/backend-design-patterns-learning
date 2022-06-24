package com.coding.design.patterns.structural.p12proxy.jdkproxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 代理中执行目标方法之前之后的操作的一个实例
 *
 * @author 张明学
 */
public class MyAdvice implements AdviceInter {

    @Override
    public void afterMethod(Object target, Method method, Object[] args) {
        System.out.println("目标对象为：" + target.getClass().getName());
        System.out.println(method.getName() + "执行完毕！");
    }


    @Override
    public void beforeMethod(Object target, Method method, Object[] args) {
        System.out.println(method.getName() + "开始执行");
        if (null != args) {
            System.out.println("参数为：" + Arrays.asList(args));
        } else {
            System.out.println("参数为：" + null);
        }
    }
}
