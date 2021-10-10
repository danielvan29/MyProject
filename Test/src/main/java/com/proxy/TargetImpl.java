package com.proxy;

/**
 * @author VAN
 */
public class TargetImpl implements MyTarget {

    @Override
    public void target() {
        System.out.println("target");
    }
}
