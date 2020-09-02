package com.ed.panda.demo.domain.model.issue;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: Edward
 * @Date: 2020/9/2 下午4:06
 *
 * 实体:发奖记录,属于发奖域
 */
@Data
@Accessors(chain = true)
public class IssueRecord {

    private Long id;

    private Long lotteryRecordId;

    private IssueStatusEnum status;
}
