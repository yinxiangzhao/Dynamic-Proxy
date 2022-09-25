package factory;

import service.UsbSell;

/**
 * @author yinxz
 * @Date 2022/9/21 19:08
 * @Description
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("目标类中的方法调用： sell");
        return 85.0f;
    }
}

/**
 * 静态代理
 * 优点 ： 实现简单，容易理解
 * 缺点 ： 当目标类增加了，代理类可能需要成倍的增加。代理类数量过多。
 *        当你的接口中功能增加了或者修改了，会影响众多的实现类，厂家类和代理类都需要修改。影响比较多，容易出错。
 *
 * 动态代理
 * 当静态代理中目标类很多的时候，可以使用动态代理，避免静态代理的缺点
 * 动态代理中即使目标类很多，代理类数量可以很少，当你修改了接口中的方法时，不会影响代理类
 *
 * 动态代理：在程序执行过程中，通过JDK的反射机制，来创建代理类对象，并动态的指定要代理目标类
 *         换句话说，动态代理是一种创建java对象的能力，让你不用创建 具体的代理类 就能创建代理类对象
 *
 * 什么是动态代理？
 *      使用JDK的反射机制，不需要创建具体类就可以创建对象的能力，创建的是代理类的对象。而不用你创建类文件。不用写java文件。
 * 什么是动态？
 *      在程序执行时，调用JDK提供的方法才能创建代理类的对象，必须要让程序跑起来。
 *
 * 实现方式：
 *     1.JDK动态代理 ： 反射，java.lang.reflect , 里面的三个类 InvocationHandler, Method, Proxy
 *     2.cgLib动态代理 : 继承
 */



