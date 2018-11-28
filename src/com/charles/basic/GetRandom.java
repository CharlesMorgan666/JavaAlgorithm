package com.charles.basic;

import java.util.Random;

/**
 * <p>
 *     获取随机数
 * </p>
 *
 * @author: 莫昌廉
 * @create: 2018-10-10 15:02
 **/
public class GetRandom {
    public static void main(String[] args) {
        /*
        Math.random():返回[0,1)范围的随机数，返回类型是double类型
        在底层本质上是实例化Random类，调用Random的nextDouble()方法
        * */
        System.out.println(Math.random());
        System.out.println(new Random().nextDouble());
        //若要获取整数形式的随机数，直接使用Random对象的nextInt或nextLong方法
        System.out.println(new Random().nextInt());
        System.out.println(new Random().nextLong());
    }
}
