package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {
    @Id
    private int id;
    private String name;
    private String address;

    @OneToMany


}
