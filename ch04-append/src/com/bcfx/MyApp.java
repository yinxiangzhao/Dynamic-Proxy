package com.bcfx;

import com.bcfx.handler.MyInvocationHandler;
import com.bcfx.service.GongNeng;
import com.bcfx.service.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yinxz
 * @Date 2022/9/25 13:43
 * @Description
 */
public class MyApp {
    public static void main(String[] args) {

        GongNeng gongNeng = new GongNeng();

        InvocationHandler handler = new MyInvocationHandler(gongNeng);

        HelloService proxy = (HelloService) Proxy.newProxyInstance(gongNeng.getClass().getClassLoader(),
                gongNeng.getClass().getInterfaces(),
                handler);

        int num = proxy.print("市场");
        System.out.println("我们期望得到的结果==" + num);
    }
}
