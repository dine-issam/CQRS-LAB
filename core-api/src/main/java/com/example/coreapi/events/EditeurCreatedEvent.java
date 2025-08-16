package com.example.coreapi.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class EditeurCreatedEvent {
    private String editeurId;
    private String name;
    private String pays;
}
