package com.example.coreapi.events;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class LibraryCreatedEvent {
    private String libraryId;
    private  String name;
}
