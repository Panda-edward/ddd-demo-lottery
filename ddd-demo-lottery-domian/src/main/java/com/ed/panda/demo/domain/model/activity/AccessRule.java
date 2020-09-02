package com.ed.panda.demo.domain.model.activity;

import com.ed.panda.demo.domain.model.ValueObject;
import com.ed.panda.demo.domain.model.client.User;

/**
 * @Author: Edward
 * @Date: 2020/8/27 下午2:10
 * 值对象:准入规则
 */
public class AccessRule implements ValueObject {

    /**
     * 是否准入
     */
    public boolean allow(User user) {
        //根据规则,判断是否准入
        return true;
    }
}
