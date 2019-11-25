/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: AopMain
 * Author:   mac
 * Date:     2019-02-13 11:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-13
 * @since 1.0.0
 */
public class AopMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AopConfig.class);
        Perform perform = (Perform) annotationConfigApplicationContext.getBean("painoPerform");
        perform.perform();
        Encoreable encoreable = (Encoreable) perform;
        encoreable.play();

        Print wordPrint = (Print) annotationConfigApplicationContext.getBean("PrintWord");
        wordPrint.print();
        wordPrint.print("PPT");
    }
}

