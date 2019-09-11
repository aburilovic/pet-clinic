package com.aburilovic.petclinic.service.map;

import com.aburilovic.petclinic.model.Vet;
import com.aburilovic.petclinic.service.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
