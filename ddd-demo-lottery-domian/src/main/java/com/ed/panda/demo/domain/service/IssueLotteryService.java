package com.ed.panda.demo.domain.service;

import com.ed.panda.demo.domain.event.IssueEvent;
import com.ed.panda.demo.domain.model.issue.IssueRecord;
import com.ed.panda.demo.domain.model.issue.IssueStatusEnum;
import com.ed.panda.demo.domain.model.lottery.LotteryRecord;
import com.ed.panda.demo.domain.model.prize.Prize;
import com.ed.panda.demo.domain.repository.IIssueRecordRepository;
import com.ed.panda.demo.domain.repository.ILotteryRecordRepository;
import com.google.common.eventbus.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Edward
 * @Date: 2020/8/30 下午10:35
 * <p>
 * 奖品发放涉及到多个领域（抽奖、奖品、下游券/卡），因此抽象成服务
 */
@Service
public class IssueLotteryService {

    @Autowired
    private ILotteryRecordRepository lotteryRecordRepository;

    @Autowired
    private IIssueRecordRepository issueRecordRepository;

    @Autowired
    private Prize prize;

    /**
     * 奖品发放(归属到用户)
     */
    @Subscribe
    public void issue(IssueEvent event) {
        //查询抽奖记录
        LotteryRecord lotteryRecord = lotteryRecordRepository.getByLotteryIdAndUid(event.getActivityId(), event.getUserId());
        if (lotteryRecord == null) {
            throw new RuntimeException();
        }
        //查询商品
        Prize prize = this.prize.getPrize(lotteryRecord.getPrizeId());
        if (prize == null) {
            throw new RuntimeException();
        }
        //插入发奖记录
        IssueRecord record = new IssueRecord().setLotteryRecordId(lotteryRecord.getId()).setStatus(IssueStatusEnum.init);
        boolean ret = issueRecordRepository.save(record);
        //奖品真实归属（spi或者MQ）
        if (ret) {

        }
    }
}
