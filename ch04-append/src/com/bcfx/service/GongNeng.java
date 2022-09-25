package com.bcfx.service;

/**
 * @author yinxz
 * @Date 2022/9/25 13:35
 * @Description
 */
public class GongNeng implements HelloService{
    @Override
    public int print(String name) {
        System.out.println("其他人写好的功能方法 " + name);
        return 2;
    }
}
