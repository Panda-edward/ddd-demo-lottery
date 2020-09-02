package com.ed.panda.demo.gateways.repository;

import com.ed.panda.demo.domain.model.prize.Prize;
import com.ed.panda.demo.domain.repository.IPrizeRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Edward
 * @Date: 2020/9/1 下午6:27
 */
@Repository
public class PrizeRepositoryImpl implements IPrizeRepository {

    /**
     * 查询奖品
     *
     * @param id 奖品ID
     * @return
     */
    @Override
    public Prize getPrizeById(Integer id) {
        return new Prize().setId(17).setName("话费充值五折券");
    }

    /**
     * 保存奖品
     *
     * @param prize 奖品实体
     * @return
     */
    @Override
    public boolean savePrize(Prize prize) {
        return false;
    }
}
