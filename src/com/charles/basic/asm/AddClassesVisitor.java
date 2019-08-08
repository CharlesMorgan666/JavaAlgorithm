package com.charles.basic.asm;


import org.objectweb.asm.*;

import java.io.FileOutputStream;

/**
 * <p></p>
 *
 * @Author 莫昌廉
 * @Date 2018/11/28 9:52
 **/
public class AddClassesVisitor extends ClassVisitor {
    private int fAcc;
    private String fName;
    private String fDesc;
    private String fVal;
    private boolean isFieldPresent;

    public AddClassesVisitor(ClassVisitor cv, int fAcc, String fName, String fDesc, String fVal) {
        super(Opcodes.ASM5, cv);
        this.fAcc = fAcc;
        this.fName = fName;
        this.fDesc = fDesc;
        this.fVal = fVal;
    }
    public AddClassesVisitor(int api) {
        super(Opcodes.ASM5);
    }
    public AddClassesVisitor(ClassVisitor cv) {
        super(Opcodes.ASM5, cv);
    }


    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println("visit方法:");
        if (name.equals(fName)) {
            isFieldPresent = true;
        }
        super.visit(version, access, name, signature, superName, interfaces);
    }


    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        System.out.println("visitMethod:" + name);
        return super.visitMethod(access, name, desc, signature, exceptions);
    }


    @Override
    public void visitEnd() {
        if (!isFieldPresent) {
            FieldVisitor fv = cv.visitField(fAcc, fName, fDesc, null, fVal);
            if (fv != null) {
                fv.visitEnd();
            }
        }
        cv.visitEnd();
    }

    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader("com.charles.basic.asm.Person");
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv1 = new AddClassesVisitor(cw, Opcodes.ACC_PRIVATE, "add1", "I", "shareniu");
        cr.accept(cv1, 0);
        byte[] toByte = cw.toByteArray();// byt 和toByte其实是相同的数组
        // 输出到class文件
        FileOutputStream fout = new FileOutputStream("Shareniu.class");
        fout.write(toByte);
        fout.close();
    }
}