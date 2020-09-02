package com.ed.panda.demo.gateways.controller;

import com.ed.panda.demo.application.command.LotteryCommand;
import com.ed.panda.demo.application.handler.LotteryCommandHandler;
import com.ed.panda.demo.domain.model.prize.Prize;
import com.ed.panda.demo.gateways.controller.dto.CommonResponse;
import com.ed.panda.demo.gateways.controller.dto.LotteryReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Edward
 * @Date: 2020/8/31 上午11:21
 */
@RestController
public class LotteryController {

    @Autowired
    private LotteryCommandHandler commandHandler;

    @PostMapping("/lottery")
    public CommonResponse<Prize> lottery(LotteryReq req) {
        LotteryCommand command = new LotteryCommand(req.getActivityId(), req.getUToken());
        Prize prize = commandHandler.lottery(command);
        return CommonResponse.success(prize);
    }

}
