package com.bcfx.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yinxz
 * @Date 2022/9/25 13:37
 * @Description
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 调用目标方法， 执行print()得到2
        Object res = method.invoke(target, args);

        // 增加功能，需要乘以2

        if (res != null) {
            Integer num = (Integer) res;
            res = num * 2;
        }

        return res;
    }
}
