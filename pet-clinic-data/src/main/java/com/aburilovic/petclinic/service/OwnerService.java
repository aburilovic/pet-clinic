package com.aburilovic.petclinic.service;

import com.aburilovic.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Long id);

    Set<Owner> findAll();
}