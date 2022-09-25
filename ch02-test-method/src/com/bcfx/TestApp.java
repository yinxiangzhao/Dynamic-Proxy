package com.bcfx;

import com.bcfx.service.HelloService;
import com.bcfx.service.impl.HelloServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yinxz
 * @Date 2022/9/24 22:30
 * @Description
 */
public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        HelloServiceImpl helloService = new HelloServiceImpl();
//        helloService.sayHello("yinxz");

        // 使用反射机制执行sayHello()。 核心Method(类中的方法)
        HelloServiceImpl target = new HelloServiceImpl();
        // 获取sayHello名称对于的Method类对象
        Method method = HelloService.class.getMethod("sayHello", String.class);
        // 通过Method可以执行sayHello()方法调用
        /**
         * invoke 是Method类中的一个方法，表示执行方法的调用
         * 1.object,表示对象的，要执行这个对象的方法
         * 2.object args, 这个方法执行所需的参数
         *
         */
        Object ret = method.invoke(target, "yinxz2");
        System.out.println(ret);
    }
}


/**
 * 反射包 java.lang.reflection 里面就三个类： InvocationHandler， Method， Proxy
 * 1.InvocationHandler(调用处理器)：就一个方法invoke()
 *
 * 2. Method类 : 表示方法的，确切的说就是目标类中的方法
 *      method.invoke(目标对象，方法的参数)
 *
 * 3. Proxy类：核心的对象，创建代理对象。之前创建对象都是new 类的构造方法（）
 *      现在我们使用Proxy类的方法，代替new的使用。
 *
 *      静态方法 newProxyInstance()
 *      作用是： 创建代理对象， 等同于静态代理中的new Taobao()
 *
 */
