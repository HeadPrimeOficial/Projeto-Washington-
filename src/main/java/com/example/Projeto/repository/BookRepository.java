package com.example.Projeto.repository;

import com.example.Projeto.model.Book;
import com.example.Projeto.service.BookService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
