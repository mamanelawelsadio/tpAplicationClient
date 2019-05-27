package fr.univtln.lmamane731.JpaEntities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pathologie {
    @Id
    @Column(name = "NOM_PATHOLOGIE")
    private String nom;
    private String description;
    @ManyToMany(mappedBy = "pathologies")
    private List<Chien> chiens = new ArrayList<>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pathologie(String nom) {
        this.nom = nom;
    }

    public Pathologie() {
    }
}
