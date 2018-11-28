package com.charles.basic.asm;

import org.objectweb.asm.*;

import java.io.FileOutputStream;

/**
 * <p></p>
 *
 * @Author 莫昌廉
 * @Date 2018/11/28 11:04
 **/
public class RemovingClassesVisitor extends ClassVisitor {
    public RemovingClassesVisitor(int api) {
        super(Opcodes.ASM5);
    }
    public RemovingClassesVisitor( ClassVisitor cv) {
        super(Opcodes.ASM5, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println("visit方法:");
        super.visit(version, access, name, signature, superName, interfaces);
    }
    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        System.out.println("visitMethod:"+name);
        if (name.equals("setId")) {
            //如果是setId 直接返回null
            return null;
        }
        return super.visitMethod(access, name, desc, signature, exceptions);
    }
    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        return super.visitField(access, name, desc, signature, value);
    }

    public static void main(String[] args) {
        ClassReader cr = new ClassReader("com.charley.basic.asm.Person");
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new RemovingClassesVisitor(cw);
//        ClassVisitor cv = new MultiClassAdapter(cw);
        cr.accept(cv, 0);
        byte[] toByte = cw.toByteArray();// byt 和toByte其实是相同的数组
        // 输出到class文件
        FileOutputStream fout = new FileOutputStream("Shareniu.class");
        fout.write(toByte);
        fout.close();
    }
    }
}