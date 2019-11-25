/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: IocMain
 * Author:   mac
 * Date:     2019-02-13 17:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-13
 * @since 1.0.0
 */
public class IocMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(IoConfig.class);
        MediaPlayer CDPlayer =
                (MediaPlayer) annotationConfigApplicationContext.getBean("CDPlayer");
        CDPlayer.play();
        CompactDisk compactDisk =
                (CompactDisk) annotationConfigApplicationContext.getBean("WhiteDisc");
        compactDisk.play();

        MediaPlayer Mp4Player =
                (MediaPlayer) annotationConfigApplicationContext.getBean("Mp4Player");
        Mp4Player.play();
        //mediaPlayer.setCompactDisk(compactDisk);
        //mediaPlayer.play();

    }
}

