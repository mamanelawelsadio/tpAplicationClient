package fr.univtln.lmamane731.Restservice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

import fr.univtln.lmamane731.DAO.ChienDao;
import fr.univtln.lmamane731.DAO.dao;
import fr.univtln.lmamane731.JpaEntities.Chien;
import fr.univtln.lmamane731.JpaEntities.Pathologie;
import fr.univtln.lmamane731.JpaEntities.Personne;

@Path("/chiens")
@Produces({"application/json"})
public class ServiceRest {
    dao dao = new dao();

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("testpostgresqllocal");
    EntityManager em = emf.createEntityManager();
    ChienDao chiendao = new ChienDao(em);

    @GET
    @Path("chien/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Chien getChien(@PathParam("id") final int ID) {
        return chiendao.getchien(ID);
    }

    @POST
    @Path("chien/persist")
    @Produces(MediaType.APPLICATION_JSON)
    public Chien persistChien(@QueryParam("nom") String nom,
                              @QueryParam("chenil") String chenil,
                              @QueryParam("pathologie") String pathologie) {

        Chien chien = new Chien();
            Personne p = new Personne();
            chien.setProprietere(p);

            Pathologie pat = new Pathologie(pathologie);
            ArrayList<Pathologie> listePathologie = new ArrayList<>();
            listePathologie.add(pat);
            chien.setPathologies(listePathologie);

        dao.create(chien);
        return chien;


    }



}
