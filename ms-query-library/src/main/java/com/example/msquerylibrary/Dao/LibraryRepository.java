package com.example.msquerylibrary.Dao;

import com.example.msquerylibrary.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library,String> {
}
