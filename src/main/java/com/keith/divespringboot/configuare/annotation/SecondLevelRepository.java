package com.keith.divespringboot.configuare.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-07
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {

    String value() default "";
}
