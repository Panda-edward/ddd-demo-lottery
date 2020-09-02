package com.ed.panda.demo.domain.repository;

import com.ed.panda.demo.domain.model.lottery.LotteryRecord;

/**
 * @Author: Edward
 * @Date: 2020/8/27 上午11:38
 */
public interface ILotteryRecordRepository {

    /**
     * 查询抽奖记录
     *
     * @param activityId
     * @param userId
     * @return
     */
    LotteryRecord getByLotteryIdAndUid(Integer activityId, Long userId);

    /**
     * save
     *
     * @param record
     * @return
     */
    boolean save(LotteryRecord record);

}
