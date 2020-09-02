package com.ed.panda.demo.domain.model.prize;

import com.ed.panda.demo.domain.model.AggregateRoot;
import com.ed.panda.demo.domain.repository.IPrizeRepository;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @Author: Edward
 * @Date: 2020/8/26 上午11:42
 * <p>
 * 聚合根:奖品
 */
@Data
@Accessors(chain = true)
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Prize implements AggregateRoot {

    @Autowired
    private IPrizeRepository prizeRepository;

    /**
     * 奖品ID,全局唯一
     */
    private Integer id;

    /**
     * 奖品名称
     */
    private String name;

    /**
     * 奖品描述
     */
    private String desc;

    /**
     * 查询奖品信息
     */
    public Prize getPrize(Integer prizeId) {
        return prizeRepository.getPrizeById(prizeId);
    }

    /**
     * 添加奖品
     */
//    public boolean addPrize(Prize prize) {
//        return prizeRepository.savePrize(prize);
//    }
    public boolean create() {
        return prizeRepository.savePrize(this);
    }

}
