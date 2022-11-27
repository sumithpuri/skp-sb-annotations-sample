/**
 * 
 */
package xyz.sumithpuri.spring.boot.annotation.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import xyz.sumithpuri.spring.boot.annotation.configuration.SBASampleConfigurationProperties;
import xyz.sumithpuri.spring.boot.annotation.model.Book;
import xyz.sumithpuri.spring.boot.annotation.service.BookServiceImpl;

/**
 * @author Sumith Puri
 *
 */
@RestController
public class SBASampleController {

	@Autowired
	BookServiceImpl bookServiceImpl;

	@Autowired
	SBASampleConfigurationProperties sbasConfigProps;

	@GetMapping("/findall")
	public HashSet<Book> getAllBook() {
		return bookServiceImpl.findAllBook();
	}

	@GetMapping("/findbyid/{id}")
	public Book geBookById(@PathVariable long id) {
		return bookServiceImpl.findBookByID(id);
	}

	@DeleteMapping("/delete")
	public void deleteBook() {
		bookServiceImpl.deleteAllData();
	}

	@PostMapping("/")
	public void addBook(@RequestBody Book book) {

		System.out.println("Testing Properties: " + sbasConfigProps.getName() + "; " 
													+ sbasConfigProps.getMail() + "; "
													+ sbasConfigProps.getYear());
		bookServiceImpl.addBook(book);
	}
}
