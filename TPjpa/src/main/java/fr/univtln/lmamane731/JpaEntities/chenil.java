package fr.univtln.lmamane731.JpaEntities;




import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class chenil {
    @Id
    @GeneratedValue
    @Column(name = "ID_CHENIL")
    private int id;
    private String nomCh;
    @OneToMany(mappedBy = "chenil")
    private List<Chien> chiens = new ArrayList<>();

    public chenil() {
    }

    public chenil(String nomCh, List<Chien> chiens) {
        this.nomCh = nomCh;
        this.chiens = chiens;
    }

    public chenil(String nomCh) {
        this.nomCh = nomCh;
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

    public String getNomCh() {
        return nomCh;
    }

    public void setNomCh(String nomCh) {
        this.nomCh = nomCh;
    }
}
