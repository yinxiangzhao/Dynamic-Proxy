package com.bcfx.factory;

import com.bcfx.service.UsbSell;

/**
 * @author yinxz
 * @Date 2022/9/25 11:06
 * @Description  目标类
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        // 目标方法
        System.out.println("目标类中，执行sell目标方法");
        return 85.0f;
    }
}
