
package com.blazebit.persistence.view.proxy.model;

import com.blazebit.persistence.view.entity.Person;
import java.io.Serializable;
import java.util.Map;

interface ContactHolderView<T> extends Serializable {

    public Map<T, Person> getContacts();

    public void setContacts(Map<T, Person> localized);
}
