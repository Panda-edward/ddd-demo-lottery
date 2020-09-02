package com.ed.panda.archetype.gateways.repository.mapper;

import com.ed.panda.archetype.gateways.repository.po.LotteryActivityPO;
import org.apache.ibatis.annotations.*;

/**
 * @Author: Edward
 * @Date: 2020/9/2 上午10:40
 */
@Mapper
public interface LotteryMapper {

    /**
     * select
     *
     * @param id
     * @return
     */
    @Select("select * from tb_lottery where id = #{id} ")
    LotteryActivityPO selectById(@Param("id") Integer id);

    /**
     * insert
     *
     * @param lotteryActivityPO
     * @return
     */
    @Insert("insert into tb_lottery(name,access_rule,status) values (#{name},#{access_rule},#{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(LotteryActivityPO lotteryActivityPO);
}
