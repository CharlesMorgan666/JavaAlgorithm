package com.charles.basic;

import java.util.UUID;

/**
 * <p></p>
 *
 * @Author 莫昌廉
 * @Date 2018/10/25 13:09
 **/
public class UUIDTest {
    public static void main(String[] args) {
//        System.out.println(UUID.fromString("12131"));
//        UUID 含义是通用唯一识别码
        //UUID 的目的，是让分布式系统中的所有元素，都能有唯一的辨识资讯,能保证每个节点所生成的标识都不会重复
        //唯一缺陷在于生成的结果串会比较长
        //并且有个局限性：不能做到全数字
        //UUID 是由一个十六位的数字组成
        System.out.println(new byte[123]);
        System.out.println(UUID.nameUUIDFromBytes(new byte[123]));
        UUID uuid = UUID.randomUUID();
        System.out.println(UUID.randomUUID());
        //randomUUID生成的id有两个特点：1.有“-”符号，2.有字母
        System.out.println(String.valueOf(uuid).replace("-", ""));
        System.out.println(String.valueOf(uuid).replace("-", "").substring(0, 15));
        UUID uuid2 = new UUID(1, 2);
        System.out.println(uuid.version());

    }
}
