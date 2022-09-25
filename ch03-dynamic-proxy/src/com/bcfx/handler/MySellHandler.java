package com.bcfx.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yinxz
 * @Date 2022/9/25 11:09
 * @Description  必须实现InvocationHandler接口，完成代理类要做的功能（1.调用目标方法  2.增强功能）
 */
public class MySellHandler implements InvocationHandler {

    private Object target = null;

    // 动态代理。目标对象是活动的，不是固定的， 需要传入进来
    // 传入的是谁, 就给谁创建代理
    public MySellHandler(Object target){
        // 给目标对象赋值
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        // 执行目标方法
        res = method.invoke(target,args);

        if(res != null) {
            float price = (Float) res;
            price += 25;
            res = price;
        }

        return res;
    }
}
