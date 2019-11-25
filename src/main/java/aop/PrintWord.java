/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: PrintWord
 * Author:   mac
 * Date:     2019/10/26 6:42 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package aop;

import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019/10/26
 * @since 1.0.0
 */
@Component("PrintWord")
public class PrintWord implements Print {
    @Override
    public void print() {
        System.out.println("正在打印Word文档！");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String print(String str) {
        System.out.println("正在打印"+str+"文档！");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return str;
    }
}

