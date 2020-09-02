package com.ed.panda.demo.application.client;

import com.ed.panda.demo.domain.model.client.User;

/**
 * @Author: Edward
 * @Date: 2020/8/31 上午11:10
 */
public interface IPassportService {

    /**
     * 校验用户信息
     *
     * @param token
     * @return
     */
    User validateByToken(String token);
}
