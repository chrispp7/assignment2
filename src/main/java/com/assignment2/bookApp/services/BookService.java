package com.assignment2.bookApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment2.bookApp.models.Book;
import com.assignment2.bookApp.repository.BookRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookService {

    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
	this.bookRepo = bookRepo;
    }

    public List<Book> findAllBooks() {
	return bookRepo.findAll();
    }

    public Book updateBook(Book book) {
	return bookRepo.save(book);
    }

    public Book findBookById(Long id) {
	return bookRepo.findBookById(id);
    }

    public void deleteBook(Long id) {
	bookRepo.deleteBookById(id);
    }
}
