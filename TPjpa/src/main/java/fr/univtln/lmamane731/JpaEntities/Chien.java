package fr.univtln.lmamane731.JpaEntities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedQueries({
        @NamedQuery(name = "findAll", query = "SELECT c from Chien c"),
        @NamedQuery(name = "getchien", query = "SELECT c from Chien c WHERE c.id = ?1"),
        @NamedQuery(name = "putChien", query = "SELECT c from Chien c WHERE c.id = ?1"),
})
@Entity
public class Chien {

    @Id
    @GeneratedValue
    @Column(name = "CHIEN_ID")
    private int id;
    private String nom;
    @OneToOne
    @JoinColumn(name = "ID_PROP")
    private Personne proprietere;
    @ManyToOne
    @JoinColumn(name = "ID_CHENIL")
    private chenil chenil;
    @ManyToMany()
    @JoinTable(name = "PATHOLOGIE_CHIEN",
            joinColumns = {@JoinColumn(name = "ID_CHIEN") })
    private List<Pathologie> pathologies = new ArrayList<>();

    public Chien() {
    }

    public Chien(String nom, Personne proprietere, fr.univtln.lmamane731.JpaEntities.chenil chenil, List<Pathologie> pathologies) {
        this.nom = nom;
        this.proprietere = proprietere;
        this.chenil = chenil;
        this.pathologies = pathologies;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Personne getProprietere() {
        return proprietere;
    }

    public void setProprietere(Personne proprietere) {
        this.proprietere = proprietere;
    }



    public chenil getChenil() {
        return chenil;
    }

    public void setChenil(chenil chenil) {
        this.chenil = chenil;
    }

    public List<Pathologie> getPathologies() {
        return pathologies;
    }

    public void setPathologies(List<Pathologie> pathologies) {
        this.pathologies = pathologies;
    }

    public void addPathologie(Pathologie p){
        pathologies.add(p);
    }

    @Override
    public String toString() {
        return "Chien{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", proprietere=" + proprietere +
                ", chenil=" + chenil +
                ", pathologies=" + pathologies +
                '}';
    }
}
