package com.keith.divespringboot.configuare.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-08
 */
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculateService{
    @Override
    public Integer sum(Integer... values) {
       // return  Arrays.stream(values).reduce(0,Integer::sum);
        return  Stream.of(values).reduce(0,Integer::sum);

    }

    public static void main(String[] args) {
        CalculateService calculateService=new Java8CalculateService();
        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9,10));
    }
}
