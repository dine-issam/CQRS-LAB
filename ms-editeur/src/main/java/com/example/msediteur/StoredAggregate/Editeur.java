package com.example.msediteur.StoredAggregate;

import com.example.coreapi.commands.EditeurCreationCommand;
import com.example.coreapi.events.EditeurCreatedEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.util.Assert;

import jakarta.persistence.*;


@Aggregate
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Editeur {
    @AggregateIdentifier
    @Id
    private String editeurId;
    private String name;
    private String pays;

    @CommandHandler
    public  Editeur(EditeurCreationCommand cmd){
        Assert.notNull(cmd.getEditeurId(),"editeurId should be not null");
        Assert.notNull(cmd.getName(),"name should be not null");

        AggregateLifecycle.apply(new EditeurCreatedEvent(cmd.getEditeurId(),
                cmd.getName(),
                cmd.getPays()));
    }

    @EventSourcingHandler
    public void on(EditeurCreatedEvent event)
    {
        this.editeurId=event.getEditeurId();
        this.name= event.getName();
    }


}
