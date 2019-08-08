package com.charles.basic;

/**
 * <p>
 *     获取对象的类型
 * </p>
 * @author 莫昌廉
 */
public class GetClassName {

    public static void main(String[] args) {
        int i =100;
        //输出Integer
        System.out.println(getType(i));
    }

    public static String getType(Object object) {
        //typeName:java.lang.Integer，获得对象的类后，getName()得到全名
        String typeName = object.getClass().getName();
        //length:9，得到最后一个.的位置
        int length = typeName.lastIndexOf(".");
        //对typeName裁剪
        String type = typeName.substring(length + 1);
        return type;
    }
}
