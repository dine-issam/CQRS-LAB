package com.example.msquerylibrary.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Library {

    @Id
    private String libraryId;
    private String name;

    @OneToMany (mappedBy = "library")
    private List<Book> Books;
}
