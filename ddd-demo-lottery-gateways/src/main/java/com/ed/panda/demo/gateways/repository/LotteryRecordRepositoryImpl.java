package com.ed.panda.demo.gateways.repository;

import com.ed.panda.demo.domain.model.lottery.LotteryRecord;
import com.ed.panda.demo.domain.repository.ILotteryRecordRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Edward
 * @Date: 2020/9/1 下午7:09
 */
@Repository
public class LotteryRecordRepositoryImpl implements ILotteryRecordRepository {

    /**
     * 查询抽奖记录
     *
     * @param activityId
     * @param userId
     * @return
     */
    @Override
    public LotteryRecord getByLotteryIdAndUid(Integer activityId, Long userId) {
        return new LotteryRecord().setUserId(5695L).setPrizeId(17).setActivityId(1);
    }

    /**
     * save
     *
     * @param record
     * @return
     */
    @Override
    public boolean save(LotteryRecord record) {
        return false;
    }
}
