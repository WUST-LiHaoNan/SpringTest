/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: EncoreableImpl
 * Author:   mac
 * Date:     2019-02-13 13:01
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
@Component
public class EncoreableImpl implements Encoreable {
    @Override
    public void play() {
        System.out.println("EncoreableImpl is play!");
    }
}

