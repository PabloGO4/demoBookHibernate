package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String isbn;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    private List<Author> authors;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


}