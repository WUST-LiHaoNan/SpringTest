/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: Users
 * Author:   mac
 * Date:     2019-02-17 20:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package entity;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-17
 * @since 1.0.0
 */
@Component
public class Users {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //重写toString()方便测试
    @Override
    public String toString() {
        return "Users [name=" + name + ", password=" + password +  "]";
    }

}

