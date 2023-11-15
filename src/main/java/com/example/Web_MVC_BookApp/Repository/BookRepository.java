package com.example.Web_MVC_BookApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Web_MVC_BookApp.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
