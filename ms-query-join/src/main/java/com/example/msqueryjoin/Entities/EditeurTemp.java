package com.example.msqueryjoin.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class EditeurTemp {
    @Id
    private String editeurId;
    private String name;
}
