package shop;

import factory.UsbKingFactory;
import jdk.nashorn.internal.ir.CallNode;
import service.UsbSell;

/**
 * @author yinxz
 * @Date 2022/9/21 19:09
 * @Description
 */
public class TaoBao implements UsbSell {
    UsbKingFactory factory = new UsbKingFactory();

    @Override
    public float sell(int amount) {
        float price = factory.sell(amount);
        price += 25;

        System.out.println("淘宝商家给你一个优惠券或者返你一个红包！");
        return price;
    }
}
