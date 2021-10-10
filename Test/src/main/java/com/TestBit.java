package com;

/**
 * @author VAN
 * 测试位运算
 */
public class TestBit {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1000));
        System.out.println(Integer.toBinaryString(1000 >>> 4));
        System.out.println(Integer.toBinaryString(-1_000));
    }
}
