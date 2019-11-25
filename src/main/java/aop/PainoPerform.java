/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: PainoPerform
 * Author:   mac
 * Date:     2019-02-13 11:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package aop;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-13
 * @since 1.0.0
 */
@Component("painoPerform")
public class PainoPerform implements Perform {
    @Override
    public void perform() {
        System.out.println("他正在表演弹钢琴！");
    }
}

