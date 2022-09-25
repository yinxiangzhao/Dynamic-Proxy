package com.bcfx;

import com.bcfx.factory.UsbKingFactory;
import com.bcfx.handler.MySellHandler;
import com.bcfx.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yinxz
 * @Date 2022/9/25 11:35
 * @Description
 */
public class MainShop {
    public static void main(String[] args) {
        // 创建代理对象，使用Proxy
        // 1.创建目标对象
        UsbSell factory = new UsbKingFactory();
        // 2.创建InvocationHandler
        InvocationHandler handler = new MySellHandler(factory);
        // 3.创建代理对象
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(
                factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);
        // com.sun.proxy.$Proxy0 : 这是JDK动态代理创建的对象类型
        System.out.println("proxy: " +proxy.getClass().getName());

        // 4.通过代理执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用对象： " + price);
    }
}

/**
 * 动态代理能做什么？
 *      可以在不改变原来目标方法功能的前提下，可以在代理中增强自己的功能代码
 *
 * JDK动态代理，必须有接口，目标类必须实现接口，没有接口时，需要使用cglib动态代理
 */
