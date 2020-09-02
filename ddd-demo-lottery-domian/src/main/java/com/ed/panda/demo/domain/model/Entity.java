package com.ed.panda.demo.domain.model;

/**
 * @Author: Edward
 * @Date: 2020/8/27 下午11:10
 * <p>
 * 实体：示意性接口
 */
public interface Entity {

    /**
     * 返回领域内唯一标识
     *
     * @return
     * */
    default Long identify() {
        return 0L;
    }
}
