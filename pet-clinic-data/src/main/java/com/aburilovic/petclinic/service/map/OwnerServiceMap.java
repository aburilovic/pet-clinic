package com.aburilovic.petclinic.service.map;

import com.aburilovic.petclinic.model.Owner;
import com.aburilovic.petclinic.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
