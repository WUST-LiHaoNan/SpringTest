/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: Customer
 * Author:   mac
 * Date:     2019-02-13 21:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package entity;

import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author mac
 * @create 2019-02-13
 * @since 1.0.0
 */
@Component
public class Customer {
    @Size(min = 3,max = 16,message = "{name.size}")
    private String name;

    @Range(min = 1,max = 150,message = "{age.size}")
    private int age;

    public Customer() {
    }

    public Customer(@Size(min = 3, max = 16) String name, @Range(min = 1, max = 150) int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

