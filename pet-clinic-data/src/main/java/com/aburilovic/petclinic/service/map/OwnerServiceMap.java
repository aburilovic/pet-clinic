package com.aburilovic.petclinic.service.map;

import com.aburilovic.petclinic.model.Owner;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> {
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
