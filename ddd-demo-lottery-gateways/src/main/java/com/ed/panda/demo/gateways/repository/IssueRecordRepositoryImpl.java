package com.ed.panda.demo.gateways.repository;

import com.ed.panda.demo.domain.model.issue.IssueRecord;
import com.ed.panda.demo.domain.repository.IIssueRecordRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Edward
 * @Date: 2020/9/2 下午4:21
 */
@Repository
public class IssueRecordRepositoryImpl implements IIssueRecordRepository {

    /**
     * save
     *
     * @param record
     * @return
     */
    @Override
    public boolean save(IssueRecord record) {
        return true;
    }
}
