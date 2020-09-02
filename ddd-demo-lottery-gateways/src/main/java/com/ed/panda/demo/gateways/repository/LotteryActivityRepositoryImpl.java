package com.ed.panda.demo.gateways.repository;

import com.ed.panda.archetype.gateways.repository.po.LotteryActivityPO;
import com.ed.panda.demo.domain.model.activity.AccessRule;
import com.ed.panda.demo.domain.model.activity.ActivityStatusEnum;
import com.ed.panda.demo.domain.model.activity.LotteryActivity;
import com.ed.panda.demo.domain.model.activity.PrizePoolItem;
import com.ed.panda.demo.domain.repository.ILotteryActivityRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Edward
 * @Date: 2020/8/26 下午8:19
 */
@Repository
public class LotteryActivityRepositoryImpl implements ILotteryActivityRepository {

    /**
     * 查询抽奖活动
     *
     * @param activityId
     * @return
     */
    @Override
    public LotteryActivity getLotteryActivityById(Integer activityId) {
        // do 持久化查询...
        return new LotteryActivity().setId(1).setName("双十一大抽奖").setAccessRule(new AccessRule());
    }

    /**
     * 保存抽奖活动
     *
     * @param activity 抽奖活动
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean saveLotteryActivity(LotteryActivity activity) {
        //DO -> PO
        List<PrizePoolItem> prizePool = activity.getPrizePool().stream().map(x ->
                new PrizePoolItem().setPrizeId(x.getPrizeId()).setProbability(x.getProbability())).collect(Collectors.toList());
        LotteryActivityPO activityPO = new LotteryActivityPO().setName(activity.getName()).setStatus(ActivityStatusEnum.INIT.getCode()).setCreateTime(new Date());
        //do 持久化...
        return true;
    }
}
