package com.ed.panda.demo.application.handler;

import com.ed.panda.demo.application.bus.DomainEventBus;
import com.ed.panda.demo.application.client.IPassportService;
import com.ed.panda.demo.application.command.LotteryCommand;
import com.ed.panda.demo.domain.event.IssueEvent;
import com.ed.panda.demo.domain.model.activity.LotteryActivity;
import com.ed.panda.demo.domain.model.client.User;
import com.ed.panda.demo.domain.model.prize.Prize;
import com.ed.panda.demo.domain.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: Edward
 * @Date: 2020/9/2 下午11:27
 *
 * <p>
 * 抽奖命令执行者
 */
@Component
public class LotteryCommandHandler {

    @Autowired
    private LotteryActivity activity;

    @Autowired
    private LotteryService lotteryService;

    @Autowired
    private IPassportService passportService;

    @Resource
    private DomainEventBus eventBus;

    /**
     * 抽奖
     */
    public Prize lottery(LotteryCommand command) {
        //风控（非业务规则）...
        //获取用户信息
        User user = passportService.validateByToken(command.getUToken());
        //抽奖
        LotteryActivity activity = this.activity.getLotteryActivity(command.getActivityId());
        Prize prize = lotteryService.lottery(activity, user);
        //发送发奖领域事件
        eventBus.postEvent(new IssueEvent(user.getUserId(), activity.getId(), prize.getId()));
        return prize;
    }

}
