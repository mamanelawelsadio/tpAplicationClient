package fr.univtln.lmamane731.DAO;

import javax.persistence.*;

public class dao implements daointerface {


    EntityManagerFactory emf = Persistence.createEntityManagerFactory("testpostgresqllocal");
    EntityManager em = emf.createEntityManager();
    EntityTransaction transac = em.getTransaction();

    @Override
    public Object create(Object o) {
        transac.begin();
        em.persist(o);
        transac.commit();
        return o;
    }

    @Override
    public Object find(Class type, Object id) {
        return (Object) em.find(type, id);
    }

    @Override
    public Object update(Object o) {
        return (Object) em.merge(o);
    }

    @Override
    public void delete(Class type, Object id) {
        Object ref = em.getReference(type, id);
        transac.begin();
        em.remove(ref);
        transac.commit();
    }


}
