package com.keith.divespringboot.configuare.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-08
 */
@Profile("Java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        CalculateService calculateService=new Java7CalculateService();
        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8));
    }
}