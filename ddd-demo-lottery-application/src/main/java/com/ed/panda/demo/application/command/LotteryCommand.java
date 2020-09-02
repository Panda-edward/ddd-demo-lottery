package com.ed.panda.demo.application.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: Edward
 * @Date: 2020/8/31 下午8:01
 */
@Data
@AllArgsConstructor
public class LotteryCommand {

    private Integer activityId;

    private String uToken;

}
