package com.example.msquerylibrary.Dao;

import com.example.msquerylibrary.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,String> {
}
