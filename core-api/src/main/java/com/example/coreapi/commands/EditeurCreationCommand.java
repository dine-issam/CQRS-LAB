package com.example.coreapi.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data @AllArgsConstructor @NoArgsConstructor
public class EditeurCreationCommand {
    @TargetAggregateIdentifier
    private String editeurId;
    private String name;
    private String pays;
}
