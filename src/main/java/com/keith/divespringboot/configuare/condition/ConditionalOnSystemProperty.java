package com.keith.divespringboot.configuare.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * java系统属性
 * @author keith
 * @version 1.0
 * @date 2019-05-08
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * 系统属性名称
     * @return
     */
    String name();

    /**
     * 系统属性值
     * @return
     */
    String value();
}
