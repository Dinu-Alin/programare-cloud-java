package com.unitbv.beansnaming;


public class DependantBeanImpl implements DependantBean {
    private final SimpleBean simpleBean;

    public DependantBeanImpl(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }
}
