package com.aburilovic.petclinic.service.map;

import com.aburilovic.petclinic.model.Pet;

public class PetServiceMap extends AbstractMapService<Pet, Long> {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
