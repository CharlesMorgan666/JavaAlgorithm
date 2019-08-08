package com.charles.basic;

/**
 * <p>
 *     获取随机数
 * </p>
 *
 * @author: 莫昌廉
 * @create: 2018-10-10 15:02
 **/
public class StringReplaceAll {
    public static void main(String[] args) {
        /*
        Math.random():返回[0,1)范围的随机数，返回类型是double类型
        在底层本质上是实例化Random类，调用Random的nextDouble()方法
        * */
       String str="\"code\": 200,\n" +
               "    \"data\": {\n" +
               "        \"billNum\": \"1054917837446995969\",\n" +
               "        \"wpayUrl\": \"http://www.kequandian.net/wechat/payment/wpay?title=%E6%A0%87%E9%A2%98&detail=%E8%AF%A6%E6%83%85&totalFee=2.02&orderNum=demo_2250\"\n" +
               "    },\n" +
               "    \"message\": \"操作成功\"";
       str.replaceAll("\n","");
        System.out.println(str);
    }
}
