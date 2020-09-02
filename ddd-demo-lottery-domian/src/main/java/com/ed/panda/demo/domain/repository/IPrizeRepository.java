package com.ed.panda.demo.domain.repository;

import com.ed.panda.demo.domain.model.prize.Prize;

/**
 * @Author: Edward
 * @Date: 2020/8/26 下午2:27
 */
public interface IPrizeRepository {

    /**
     * 查询奖品
     *
     * @param id 奖品ID
     * @return
     */
    Prize getPrizeById(Integer id);

    /**
     * 保存奖品
     *
     * @param prize 奖品实体
     * @return
     */
    boolean savePrize(Prize prize);
}
