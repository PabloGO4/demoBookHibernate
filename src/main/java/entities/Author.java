package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Book> books;

    public Author() {
        books = new ArrayList<Book>();
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        books = new ArrayList<Book>();

    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*public List<Book> getBooks() {
        return books;
    }*/

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book b){
        books.add(b);
    }
    public void removeBook(Book b){
        books.remove(b);

    }

    public String getBooks(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < books.size();i++){
            sb.append(", ").append(books.get(i).getTitle());
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }


}