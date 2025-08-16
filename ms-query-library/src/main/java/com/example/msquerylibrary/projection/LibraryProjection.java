package com.example.msquerylibrary.projection;

import com.example.coreapi.events.BookAddedEvent;
import com.example.coreapi.events.BookRemovedEvent;
import com.example.coreapi.events.LibraryCreatedEvent;
import com.example.msquerylibrary.Dao.BookRepository;
import com.example.msquerylibrary.Dao.LibraryRepository;
import com.example.msquerylibrary.entities.Book;
import com.example.msquerylibrary.entities.Library;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryProjection {
    @Autowired
    private LibraryRepository libraryRepository;
    @Autowired
    private BookRepository bookRepository;

    @EventHandler
    public void  AddLibrary(LibraryCreatedEvent event)
    {
        Library library=new Library(event.getLibraryId(), event.getName(), null);
        libraryRepository.save(library);
    }

    @EventHandler
    public void addBook(BookAddedEvent event){
        Library library=libraryRepository.findById(event.getLibraryId()).get();

        bookRepository.save(
                new Book(event.getIsbn(), event.getTitle(), library, event.getEditeurId()));
    }

    @EventHandler
    public void removebook(BookRemovedEvent event) {

        bookRepository.deleteById(event.getIsbn());
    }
}
