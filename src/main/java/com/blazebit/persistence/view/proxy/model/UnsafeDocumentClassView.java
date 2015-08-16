package com.blazebit.persistence.view.proxy.model;

public abstract class UnsafeDocumentClassView implements DocumentInterfaceView {

    private final long age;
    private final Integer contactPersonNumber;

    public UnsafeDocumentClassView(
        Long age,
        Integer contactPersonNumber
    ) {
    	System.out.println("Initializing: " + getName());
        this.age = age;
        this.contactPersonNumber = contactPersonNumber;
    }

    public long getAge() {
        return age;
    }

    public Integer getContactPersonNumber() {
        return contactPersonNumber;
    }
}
