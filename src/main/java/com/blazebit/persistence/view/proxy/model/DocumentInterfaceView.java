package com.blazebit.persistence.view.proxy.model;

import com.blazebit.persistence.view.entity.Person;

public interface DocumentInterfaceView extends IdHolderView<Long>, ContactHolderView<Integer> {

    public String getName();

    public Person getMyContactPerson();

    public Person getFirstContactPerson();
}
