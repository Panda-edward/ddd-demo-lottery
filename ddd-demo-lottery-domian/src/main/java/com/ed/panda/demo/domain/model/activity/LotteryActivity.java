package com.ed.panda.demo.domain.model.activity;

import com.ed.panda.demo.domain.model.AggregateRoot;
import com.ed.panda.demo.domain.repository.ILotteryActivityRepository;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Edward
 * @Date: 2020/9/2 下午3:12
 * <p>
 * 聚合根:抽奖活动
 */
@Data
@Accessors(chain = true)
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LotteryActivity implements AggregateRoot {

    /**
     * 抽奖活动ID,全局唯一
     */
    private Integer id;

    /**
     * 抽奖活动名称
     */
    private String name;

    /**
     * 奖池
     */
    private List<PrizePoolItem> prizePool;

    /**
     * 准入规则:值对象
     */
    private AccessRule accessRule;

    /**
     * 活动状态 0-初始化,1-进行中,2-已结束
     */
    private ActivityStatusEnum status;

    @Autowired
    private ILotteryActivityRepository lotteryActivityRepository;

    /**
     * 查询抽奖活动
     */
    public LotteryActivity getLotteryActivity(Integer activityId) {
        return lotteryActivityRepository.getLotteryActivityById(activityId);
    }

    /**
     * 创建抽奖活动
     */
    public boolean create() {
        //check概率合法性
        List<PrizePoolItem> prizePool = this.getPrizePool();
        if (prizePool.size() <= 1) {
            throw new RuntimeException("奖池中奖品种类应该>1");
        }
        int totalProbability = prizePool.stream().mapToInt(PrizePoolItem::getProbability).sum();
        if (totalProbability != 100) {
            throw new RuntimeException("奖池总概率不是100%");
        }
        //save抽奖活动
        return lotteryActivityRepository.saveLotteryActivity(this);
    }
}
