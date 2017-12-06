package br.com.fiap;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.NotaFiscal;
import br.com.fiap.entity.Produto;
import br.com.fiap.facade.Facade;
import org.junit.Assert;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by logonrm on 05/12/2017.
 */
public class TestaAplicacao {

    @Test
    public void testaAplicacao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AtividadeFinal");
        EntityManager em = emf.createEntityManager();

        Facade facade = new Facade(em);

        Produto produto = new Produto(100D, "Sandalia Havaianas", "Havaianas Recuse Imitações");
        Produto produto2 = new Produto(150.90, "All Star", "Modelo Nando Reis");

        facade.inserirProduto(produto);
        facade.inserirProduto(produto2);

        Assert.assertEquals(2, facade.listarProdutos().size());

        Cliente cliente = new Cliente("41999068866", "Amanda Prado", "Rua ali", "Solteira", "meu@email.com");
        Cliente cliente2 = new Cliente("11111111111", "Lucas Rafael", "Rua acolá", "Solteiro", "email@meu.com");

        facade.inserirCliente(cliente);
        facade.inserirCliente(cliente2);

        Assert.assertEquals(2, facade.listarClientes().size());

        NotaFiscal notaFiscal = new NotaFiscal()

    }

}
