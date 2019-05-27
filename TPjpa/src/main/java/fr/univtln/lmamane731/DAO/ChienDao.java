package fr.univtln.lmamane731.DAO;





import fr.univtln.lmamane731.Chien;

import javax.persistence.EntityManager;


public class ChienDao {
    EntityManager em;

    public ChienDao(EntityManager em) {
        this.em = em;
    }

    public Chien getChienAt(final int ID) {
        return (Chien) em.createNamedQuery("getChienAt").setParameter(1, ID).getResultList().get(0);
    }

    public Chien persist(final int ID) {
        return (Chien) em.createNamedQuery("putChien").setParameter(1, ID).getResultList().get(0);
    }


}
