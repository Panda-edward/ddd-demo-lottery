package com.ed.panda.demo.gateways.client;

import com.ed.panda.demo.application.client.IPassportService;
import com.ed.panda.demo.domain.model.client.User;
import org.springframework.stereotype.Component;

/**
 * @Author: Edward
 * @Date: 2020/8/30 下午11:25
 */
@Component
public class PassportServiceImpl implements IPassportService {

    /**
     * 校验用户信息
     *
     * @param token
     * @return
     */
    @Override
    public User validateByToken(String token) {
        //invoke passport-sdk ...
        return new User().setUserId(6245L);
    }
}
