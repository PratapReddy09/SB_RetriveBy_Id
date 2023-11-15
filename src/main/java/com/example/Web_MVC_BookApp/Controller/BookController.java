package com.example.Web_MVC_BookApp.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Web_MVC_BookApp.Entity.Book;
import com.example.Web_MVC_BookApp.Repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/book")
	public String getBookById(@RequestParam("id") Integer id, Model model) {
		Optional<Book> findById=repo.findById(id);
		if(findById.isPresent()) {
			Book bookObj=findById.get();	
			model.addAttribute("book", bookObj);
			}
		return "index";
	}
}
