package com.ed.panda.demo.domain.model.client;

import com.ed.panda.demo.domain.model.ValueObject;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: Edward
 * @Date: 2020/8/30 下午11:40
 */
@Data
@Accessors(chain = true)
public class User implements ValueObject {

    private Long userId;
}
