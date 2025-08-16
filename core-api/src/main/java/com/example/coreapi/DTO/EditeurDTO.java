package com.example.coreapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class EditeurDTO {
    private String editeurId;
    private String name;
    private String pays;
}
