package com.assignment2.bookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment2.bookApp.models.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

    void deleteBookById(Long id);

    Book findBookById(Long id);

}
