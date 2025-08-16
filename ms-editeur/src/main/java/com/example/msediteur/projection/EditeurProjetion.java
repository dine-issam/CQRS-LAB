package com.example.msediteur.projection;

import com.example.coreapi.events.EditeurCreatedEvent;
import com.example.msediteur.StoredAggregate.Editeur;
import com.example.msediteur.dao.EditeurRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditeurProjetion {

    @Autowired
    EditeurRepository editeurRepository;

    @EventHandler
    public  void aDDEditeur(EditeurCreatedEvent event)
    {
        Editeur editeur = new Editeur(event.getEditeurId(), event.getName(), event.getPays());
        editeurRepository.save(editeur);
    }
}
