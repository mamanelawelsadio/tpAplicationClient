package fr.univtln.lmamane731;


import javax.persistence.*;

@Entity
public class Personne {
    @Id
    @GeneratedValue
    @Column(name = "PERSONNE_ID")
    private int id;
    private String nom;
    private String prenom;
    private int age;
    @OneToOne(mappedBy = "proprietere")
    private Chien chien;

    public Personne() {
    }

    

    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Personne(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }
}
