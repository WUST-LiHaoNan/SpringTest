/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: BlackDisc
 * Author:   mac
 * Date:     2019-02-13 17:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-13
 * @since 1.0.0
 */
@Component("BlackDisc")
@PropertySource(value = "ioc.properties")
public class BlackDisc implements CompactDisk {
    @Value("${black.artist}")
    private String artist;
    @Value("${black.title}")
    private String title;

    @Override
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}

