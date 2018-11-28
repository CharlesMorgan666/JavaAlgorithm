package com.charles;

import static com.jfinal.kit.HashKit.md5;

/**
 * @author 莫昌廉
 */
public class test {
    public static void main(String[] args){
        String a="appId=demo customerData=customer data detail=详情 notifyUrl=http://127.0.0.1:8080/api/pub/payment/order/notify " +
                "orderNum=1235 paymentType=WECHAT title=标题 totalFee=2.02 tradeType=WPA";
        String sign = md5(a).toUpperCase();
        System.out.println(sign);
    }
}
