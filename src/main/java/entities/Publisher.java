package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Publisher() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
