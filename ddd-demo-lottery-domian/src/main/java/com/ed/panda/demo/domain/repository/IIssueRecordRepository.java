package com.ed.panda.demo.domain.repository;

import com.ed.panda.demo.domain.model.issue.IssueRecord;

/**
 * @Author: Edward
 * @Date: 2020/9/2 下午4:19
 */
public interface IIssueRecordRepository {

    /**
     * save
     *
     * @param record
     * @return
     */
    boolean save(IssueRecord record);
}
