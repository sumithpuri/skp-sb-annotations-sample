/**
 * 
 */
package xyz.sumithpuri.spring.boot.annotation.model;

/**
 * @author Sumith Puri
 *
 */
public class Book {

	private long id;
	private String name;
	private String title;

	public Book() {
		super();
	}

	public Book(long id, String name, String title) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}