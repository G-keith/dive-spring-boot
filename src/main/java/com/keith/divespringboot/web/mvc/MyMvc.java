package com.keith.divespringboot.web.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keith
 * @version 1.0
 * @date 2019-04-03
 */
@RestController
public class MyMvc {

    @GetMapping("/my/mvc")
    public String get(){
        return "HelloWorld";
    }
}
