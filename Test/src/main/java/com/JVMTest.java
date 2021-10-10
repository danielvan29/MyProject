package com;

@SuppressWarnings("all")
public class JVMTest {

    byte[] bytes = new byte[1024 * 1024];

    public static void main(String[] args) {

        new JVMTest();
        //while (true) {
        //    new JVMTest();
        //}
        //System.out.println(Runtime.getRuntime().maxMemory());
        //System.out.println(Runtime.getRuntime().totalMemory());
    }
}
