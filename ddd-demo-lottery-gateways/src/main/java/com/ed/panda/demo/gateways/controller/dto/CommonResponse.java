package com.ed.panda.demo.gateways.controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: Edward
 * @Date: 2020/8/31 下午5:00
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CommonResponse<T> {

    private int errno;

    private String errMsg;

    private T data;

    public static <T> CommonResponse<T> success() {
        return new CommonResponse<>(0, "success", null);
    }

    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<>(0, "success", data);
    }

    public static <T> CommonResponse<T> fail(int errno, String errMsg) {
        return new CommonResponse<>(errno, errMsg, null);
    }
}
