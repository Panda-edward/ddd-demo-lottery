package com.ed.panda.demo.domain.model.activity;

/**
 * @Author: Edward
 * @Date: 2020/8/26 下午8:57
 */
public enum ActivityStatusEnum {

    /** */
    INIT(0,"初始化"),
    /** */
    STARTED(1,"进行中"),
    /** */
    FINISHED(2,"已结束"),
    ;

    private int code;

    private String desc;

    ActivityStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
