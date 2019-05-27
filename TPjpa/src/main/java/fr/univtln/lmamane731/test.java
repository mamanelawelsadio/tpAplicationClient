package fr.univtln.lmamane731;


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
        Personne pr1 = new Personne("Paul", "Jean");
        Personne pr2 = new Personne("Pierre", "Jean");
        Personne pr3 = new Personne("Pierre", "Arthur");
        Personne pr4 = new Personne("Marie", "Antoinette");
        Personne pr5 = new Personne("sadio","mamane");

        Chien c1 = new Chien(), c2 = new Chien();
        c1.setNom("medor");
        c2.setNom("mekou");
        c2.setProprietere(pr1);
        c1.setProprietere(pr2);

        chenil ch1 = new chenil();
        
        
        
        c1.setChenil(ch1);
        c2.setChenil(ch1);
        

        Pathologie pa1 = new Pathologie();
        pa1.setNom("maladie");
        c2.addPathologie(pa1);
        c1.addPathologie(pa1);

        EntityTransaction transac = em.getTransaction();

        transac.begin();
        em.persist(pr1);
        em.persist(pr2);
        em.persist(pr3);
        em.persist(pr4);
        em.persist(pr5);
        em.persist(c1);
        em.persist(c2);
        em.persist(ch1);
        em.persist(pa1);
        transac.commit();

        em.refresh(pr1);
        em.refresh(c1);
        System.out.println(pr1);
        System.out.println(c1);
        
        
    }
}
