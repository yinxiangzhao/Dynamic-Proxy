package service;
/**
 * @author yinxz
 * @Date 2022/9/19 20:30
 * @Description
 */

public interface UsbSell {
    /**
     * 表示功能的，厂家和商家都要完成的功能,表示一次购买的价格
     * @param amount
     * @return
     */
    float sell(int amount);
}
