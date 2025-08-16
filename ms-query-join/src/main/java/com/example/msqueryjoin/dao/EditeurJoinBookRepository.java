package com.example.msqueryjoin.dao;


import com.example.msqueryjoin.Entities.CompositeKey;
import com.example.msqueryjoin.Entities.EditeurJoinBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditeurJoinBookRepository extends JpaRepository<EditeurJoinBook, CompositeKey> {

    int deleteByKeyJoin_Isbn(String isbn);

}
