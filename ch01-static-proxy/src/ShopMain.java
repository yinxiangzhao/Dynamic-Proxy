import shop.TaoBao;

/**
 * @author yinxz
 * @Date 2022/9/21 19:10
 * @Description
 */
public class ShopMain {
    public static void main(String[] args) {
        TaoBao taoBao = new TaoBao();
        float price = taoBao.sell(1);
        System.out.println("通过淘宝的商家购买U盘的单价为：" + price);
    }
}
