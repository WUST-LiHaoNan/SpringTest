/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: TimeCalculate
 * Author:   mac
 * Date:     2019/10/26 6:43 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019/10/26
 * @since 1.0.0
 */
@Aspect
@Component
public class TimeCalculate {
    @Pointcut("execution(void aop.Print.print(..))")
    public void print(){
    }

    @Pointcut("execution(String aop.Print.print(String))")
    public void printString(){

    }

    @Around("printString()")
    public void StringPrint(ProceedingJoinPoint joinPoint){
        System.out.println("开始打印");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.print("当前时间是:");
        System.out.println(df.format(new Date()));
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.print("当前时间是:");
        System.out.println(df.format(new Date()));
        System.out.println("打印结束");
    }

    @Before("print()")
    public void BeforePrint(){
        System.out.println("开始打印！");
    }

    @Around("print()")
    public void Calculate(ProceedingJoinPoint joinPoint){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.print("当前时间是:");
        System.out.println(df.format(new Date()));
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.print("当前时间是:");
        System.out.println(df.format(new Date()));
    }

    @After("print()")
    public void AfterPrint(){
        System.out.println("打印结束！");
    }
}

