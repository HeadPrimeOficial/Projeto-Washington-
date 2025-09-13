package com.example.Projeto.service;

import com.example.Projeto.model.Book;
import com.example.Projeto.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

   private final BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    public Book save(Book b) {
        return bookRepository.save(b);
    }

    public Optional<Book> update(Long id, Book b) {
        if (!bookRepository.existsById(id)) return Optional.empty();
        b.setId(id);
        return Optional.of(bookRepository.save(b));
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
