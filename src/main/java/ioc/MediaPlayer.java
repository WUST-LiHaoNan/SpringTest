/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MediaPlayer
 * Author:   mac
 * Date:     2019-02-13 17:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ioc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-13
 * @since 1.0.0
 */

public abstract class MediaPlayer {
    public void play(){
        compactDisk.play();
    }

    @Autowired
    @Qualifier(value = "BlackDisc")
    private CompactDisk compactDisk;

    public CompactDisk getCompactDisk() {
        return compactDisk;
    }

    public void setCompactDisk(CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }
}
