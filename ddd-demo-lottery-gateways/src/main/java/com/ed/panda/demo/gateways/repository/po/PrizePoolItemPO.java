package com.ed.panda.archetype.gateways.repository.po;

import lombok.Data;

/**
 * @Author: Edward
 * @Date: 2020/8/26 下午8:32
 *
 * 奖池项PO
 */
@Data
public class PrizePoolItemPO {

    private Integer id;

    private int probability;

    private Integer prizeId;

    private Integer activityId;

}
