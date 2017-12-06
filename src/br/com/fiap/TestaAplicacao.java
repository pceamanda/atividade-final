package br.com.fiap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by logonrm on 05/12/2017.
 */
public class TestaAplicacao {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AtividadeFinal");
        EntityManager em = emf.createEntityManager();

    }

}
