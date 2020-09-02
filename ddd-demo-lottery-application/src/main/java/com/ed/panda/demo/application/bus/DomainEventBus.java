package com.ed.panda.demo.application.bus;

import com.ed.panda.demo.domain.model.DomainEvent;
import com.ed.panda.demo.domain.service.IssueLotteryService;
import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: Edward
 * @Date: 2020/8/31 下午9:09
 */
@Component
public class DomainEventBus {

    private EventBus eventBus = new EventBus("domain event bus");

    @Autowired
    private IssueLotteryService issueLotteryService;

    @PostConstruct
    public void initListener() {
        eventBus.register(issueLotteryService);
    }

    public void postEvent(DomainEvent event) {
        eventBus.post(event);
    }

}
