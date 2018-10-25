package com.charley.basic;

import io.undertow.util.WorkerUtils;

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
        System.out.println(new byte[123]);
        System.out.println(UUID.nameUUIDFromBytes(new byte[123]));
        System.out.println(UUID.randomUUID());
        UUID uuid=new UUID(1,2);
        System.out.println( uuid.version());

    }
}
