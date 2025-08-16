package com.example.msquerylibrary.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Book {

    @Id
    private String isbn;
    private String title;
    @ManyToOne
    private Library library;
    private String editeurId;

}
