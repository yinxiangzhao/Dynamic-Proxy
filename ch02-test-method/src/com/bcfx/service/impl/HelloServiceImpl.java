package com.bcfx.service.impl;

import com.bcfx.service.HelloService;

/**
 * @author yinxz
 * @Date 2022/9/24 22:28
 * @Description
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("你好! " + name);
    }
}
