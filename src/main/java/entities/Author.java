package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Author {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;

    @ManyToMany
    private List<Book> books;
}