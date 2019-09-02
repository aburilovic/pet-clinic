package com.aburilovic.petclinic.service;

import com.aburilovic.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Long id);

    Set<Vet> findAll();
}
