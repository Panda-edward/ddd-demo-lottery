package com.ed.panda.archetype.gateways.repository.po;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Author: Edward
 * @Date: 2020/8/26 下午8:46
 *
 * 抽奖活动PO
 */
@Data
@Accessors(chain = true)
public class LotteryActivityPO {

    private Integer id;

    private String name;

    private String accessRule;

    private int status;

    private Date createTime;

    private Date updateTime;
}
