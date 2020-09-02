package com.ed.panda.demo.domain.event;

import com.ed.panda.demo.domain.model.DomainEvent;
import com.ed.panda.demo.domain.model.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: Edward
 * @Date: 2020/8/31 下午8:31
 */
@Data
@AllArgsConstructor
public class IssueEvent implements DomainEvent, Entity {

    private Long userId;

    private Integer activityId;

    private Integer prizeId;
}
