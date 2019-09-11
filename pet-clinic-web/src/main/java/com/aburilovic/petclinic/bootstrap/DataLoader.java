package com.aburilovic.petclinic.bootstrap;

import com.aburilovic.petclinic.model.Owner;
import com.aburilovic.petclinic.model.Vet;
import com.aburilovic.petclinic.service.OwnerService;
import com.aburilovic.petclinic.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jozo");
        owner1.setLastName("Jozic");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ante");
        owner2.setLastName("Antic");

        ownerService.save(owner1);

        System.out.println("Loaded owners...........");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Marko");
        vet1.setLastName("Markic");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Ivan");
        vet2.setLastName("Ivanic");

        vetService.save(vet2);
        System.out.println("Loaded vets...........");
    }
}
