package com.example.coreapi.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data @AllArgsConstructor @NoArgsConstructor
public class AddBookCommand {

    @TargetAggregateIdentifier
    private String libraryId;
    private String isbn;
    private String title;
    private String editeurId;
}
