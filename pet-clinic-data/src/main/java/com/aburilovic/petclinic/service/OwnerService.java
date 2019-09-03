package com.aburilovic.petclinic.service;

import com.aburilovic.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
