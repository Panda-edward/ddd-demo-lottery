package com.ed.panda.demo.domain.repository;

import com.ed.panda.demo.domain.model.activity.LotteryActivity;

/**
 * @Author: Edward
 * @Date: 2020/8/26 下午7:50
 */
public interface ILotteryActivityRepository {

    /**
     * 查询抽奖活动
     *
     * @param activityId
     * @return
     */
    LotteryActivity getLotteryActivityById(Integer activityId);

    /**
     * 保存抽奖活动
     *
     * @param activity 抽奖活动
     * @return
     */
    boolean saveLotteryActivity(LotteryActivity activity);

}
