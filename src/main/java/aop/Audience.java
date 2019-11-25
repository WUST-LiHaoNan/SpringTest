/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: Audience
 * Author:   mac
 * Date:     2019-02-13 11:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac
 * @create 2019-02-13
 * @since 1.0.0
 */
@Aspect
@Component
public class Audience {
    @Pointcut("execution(* aop.Perform.perform(..))")
    public void perform() {
    }

    @Before("perform()")
    public void beforewatch() {
        System.out.println("演出要开始了！");
    }

    @Around("perform()")
    public void watchPerform(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("将手机关机!");
            System.out.println("找到自己的座位!");
            proceedingJoinPoint.proceed();
            System.out.println("鼓掌喝彩！");
        } catch (Exception e) {
            System.out.println("去售票点进行退票");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

