package com.ed.panda.demo.domain.service;

import com.ed.panda.demo.domain.model.activity.LotteryActivity;
import com.ed.panda.demo.domain.model.client.User;
import com.ed.panda.demo.domain.model.lottery.LotteryRecord;
import com.ed.panda.demo.domain.model.prize.Prize;
import com.ed.panda.demo.domain.repository.ILotteryRecordRepository;
import com.ed.panda.demo.domain.repository.IPrizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Edward
 * @Date: 2020/8/26 下午6:18
 * <p>
 * 因为涉及多个领域(抽奖活动域、奖品域、下游用户域),采用领域service
 */
@Service
public class LotteryService {

    @Autowired
    private IPrizeRepository prizeRepository;

    @Autowired
    private ILotteryRecordRepository lotteryRecordRepository;

    /**
     * 抽奖
     */
    public Prize lottery(LotteryActivity activity, User user) {
        //抽奖活动check
        if (activity == null) {
            throw new RuntimeException("抽奖活动不存在");
        }
        //check准入
        boolean allow = activity.getAccessRule().allow(user);
        if (!allow) {
            throw new RuntimeException("不符合抽奖条件");
        }
        //抽奖算法 todo
        Integer prizeId = 17;
        //查询奖品信息
        Prize prize = prizeRepository.getPrizeById(prizeId);
        //插入抽奖记录
        LotteryRecord lotteryRecord = new LotteryRecord().setPrizeId(prize.getId()).setActivityId(activity.getId()).setUserId(user.getUserId());
        lotteryRecordRepository.save(lotteryRecord);
        return prize;
    }

}
