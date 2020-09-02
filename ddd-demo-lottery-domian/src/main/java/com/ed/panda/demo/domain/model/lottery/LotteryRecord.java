package com.ed.panda.demo.domain.model.lottery;

import com.ed.panda.demo.domain.model.Entity;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @Author: Edward
 * @Date: 2020/8/30 下午10:47
 * <p>
 * 实体:抽奖记录,属于抽奖域
 */
@Data
@Accessors(chain = true)
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LotteryRecord implements Entity {

    private Long id;

    private Long userId;

    private Integer activityId;

    private Integer prizeId;
}
