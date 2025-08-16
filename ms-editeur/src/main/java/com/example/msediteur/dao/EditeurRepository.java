package com.example.msediteur.dao;

import com.example.msediteur.StoredAggregate.Editeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EditeurRepository extends JpaRepository<Editeur, String> {

}

