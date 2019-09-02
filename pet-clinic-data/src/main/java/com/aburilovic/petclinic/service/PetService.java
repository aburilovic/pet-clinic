package com.aburilovic.petclinic.service;

import com.aburilovic.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Long id);

    Set<Pet> findAll();
}
