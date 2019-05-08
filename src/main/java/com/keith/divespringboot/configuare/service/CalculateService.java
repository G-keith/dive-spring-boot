package com.keith.divespringboot.configuare.service;

/**
 * @author keith
 * @version 1.0
 * @date 2019-05-08
 */
public interface CalculateService {

    /**
     * 求和
     * @param values 入参
     * @return 求和结果
     */
    Integer sum(Integer... values);
}
