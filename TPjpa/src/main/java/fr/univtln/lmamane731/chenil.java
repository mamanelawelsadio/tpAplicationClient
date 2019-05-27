package fr.univtln.lmamane731;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class chenil {
    @Id
    @GeneratedValue
    @Column(name = "ID_CHENIL")
    private int id;
    @OneToMany(mappedBy = "chenil")
    private List<Chien> chiens = new ArrayList<>();
    
    public chenil() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Chien> getChiens() {
        return chiens;
    }

    public void setChiens(List<Chien> chiens) {
        this.chiens = chiens;
    }

   
}
