package com.aburilovic.petclinic.service.map;

import com.aburilovic.petclinic.model.Pet;
import com.aburilovic.petclinic.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }
}
