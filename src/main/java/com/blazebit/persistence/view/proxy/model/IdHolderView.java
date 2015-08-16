package com.blazebit.persistence.view.proxy.model;

import java.io.Serializable;

interface IdHolderView<T> extends Serializable {

    public T getId();

    public void setId(T id);
}
