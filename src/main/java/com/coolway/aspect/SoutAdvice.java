package com.coolway.aspect;

import org.aspectj.lang.ProceedingJoinPoint;


public class SoutAdvice {
    //前置通知
    public void before() {
        System.out.println("执行前置通知");
    }

    //后置通知
    public void after() {
        System.out.println("出现异常也会调用");
    }

    //后置返回通知
    public void afterReturning() {
        System.out.println("后置通知出现异常不会调用");
    }
    //环绕通知
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知前置");
        Object proceed = pjp.proceed();
        System.out.println("环绕通知后置");
        return proceed;
    }
    //异常通知
    public void afterThrowing() {
        System.out.println("异常通知");
    }

}
