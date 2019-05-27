package fr.univtln.lmamane731.MAIN;


import fr.univtln.lmamane731.JpaEntities.Chien;
import fr.univtln.lmamane731.JpaEntities.Pathologie;
import fr.univtln.lmamane731.JpaEntities.Personne;
import fr.univtln.lmamane731.JpaEntities.chenil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class test
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("testpostgresqllocal");
        EntityManager em = emf.createEntityManager();
        Personne p1 = new Personne("marcus", "huston");
        Personne p2 = new Personne("alain  ", "cavet");
        Personne p3 = new Personne("don", "donald");
        Personne p4 = new Personne("moustine", "jazzy");
        Personne p5 = new Personne("soul","banne");

        Chien c1 = new Chien(), c2 = new Chien();
        c1.setNom("medor");
        c2.setNom("sax");
        c2.setProprietere(p1);
        c1.setProprietere(p2);

        chenil ch1 = new chenil();
        ch1.setNomCh("maison des chiens");

        c1.setChenil(ch1);
        c2.setChenil(ch1);

        Pathologie pa1 = new Pathologie();
        pa1.setNom("maladie");
        c2.addPathologie(pa1);
        c1.addPathologie(pa1);

        EntityTransaction transac = em.getTransaction();

        transac.begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);
        em.persist(c1);
        em.persist(c2);
        em.persist(ch1);
        em.persist(pa1);
        transac.commit();

        em.refresh(p1);
        em.refresh(c1);
        System.out.println(p1);
        System.out.println(c1);


    }
}
