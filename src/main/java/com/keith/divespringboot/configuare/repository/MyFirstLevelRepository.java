package com.keith.divespringboot.configuare.repository;

import com.keith.divespringboot.configuare.annotation.FirstLevelRepository;
import org.springframework.stereotype.Component;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-07
 */
@FirstLevelRepository(value = "myFirstLevelRepository")
//@Component(value = "myFirstLevelRepository")派生性，由component到自定义注解，实现结果一样
public class MyFirstLevelRepository {
}
