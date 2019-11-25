/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: WhiteDisc
 * Author:   mac
 * Date:     2019/10/16 3:48 下午
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
 * @create 2019/10/16
 * @since 1.0.0
 */
@Component("WhiteDisc")
@PropertySource(value = "ioc.properties")
public class WhiteDisc implements CompactDisk {
    @Value("${white.artist}")
    private String artist;
    @Value("${white.title}")
    private String title;

    @Override
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}

