package com.ed.panda.demo.gateways.controller.dto;

import lombok.Data;

/**
 * @Author: Edward
 * @Date: 2020/8/31 下午5:10
 */
@Data
public class LotteryReq {

    private Integer activityId;

    private String uToken;

    //端信息,用于风控...
}
