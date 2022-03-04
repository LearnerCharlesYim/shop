package com.charles.shop.common.exception;

/**
 * 断言处理类，用于抛出各种API异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new BizException(message);
    }

    public static void fail(BaseErrorInfoInterface errorInfo) {
        throw new BizException(errorInfo);
    }
}
