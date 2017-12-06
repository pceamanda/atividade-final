package br.com.fiap;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.NotaFiscalDAO;
import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.NotaFiscal;
import br.com.fiap.entity.Produto;

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
