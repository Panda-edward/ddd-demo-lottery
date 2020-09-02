package com.ed.panda.demo.domain.model.activity;

import com.ed.panda.demo.domain.model.Entity;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: Edward
 * @Date: 2020/8/26 上午11:08
 * <p>
 * 实体:奖池项,被LotteryActivity聚合
 */
@Data
@Accessors(chain = true)
public class PrizePoolItem implements Entity {

    /**
     * 奖品池id,聚合内唯一
     */
    private Integer id;

    /**
     * 中奖概率
     */
    private int probability;

    /**
     * 奖品ID; 实体与聚合根通过ID关联
     */
    private Integer prizeId;

}
