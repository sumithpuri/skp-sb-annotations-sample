/**
 * 
 */
package xyz.sumithpuri.spring.boot.annotation.service;

import java.util.HashSet;

import xyz.sumithpuri.spring.boot.annotation.model.Book;

/**
 * @author Sumith Puri
 *
 */

public interface BookService {
	HashSet<Book> findAllBook();

	Book findBookByID(long id);

	void addBook(Book b);

	void deleteAllData();
}