/**
 * Copyright (C), 2016-2019, 李浩楠
 * FileName: AopConfig
 * Author:   mac
 * Date:     2019-02-13 11:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2019-02-13
 * @since 1.0.0
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@Aspect
public class AopConfig {
    @DeclareParents(value = "aop.Perform+",defaultImpl = EncoreableImpl.class)
    public static Encoreable encoreable;
}

