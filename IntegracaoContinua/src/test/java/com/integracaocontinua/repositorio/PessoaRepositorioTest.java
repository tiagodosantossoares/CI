/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.integracaocontinua.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.print.PeekGraphics;
import trabalho_test.entidade.PessoaEntidade;

/**
 *
 * @author tiago
 */
public class PessoaRepositorioTest {
    
    List<PessoaEntidade> lista;
    PessoaEntidade p;
    PessoaRepositorio dao;
            
    public PessoaRepositorioTest() {
        dao=new PessoaRepositorio<>();
        lista=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
          p=new PessoaEntidade();
        p.setNome("nome"+i);
        p.setSobrenome("sobrenome"+i);
        p.setEmail("email"+i);
        p.setEndereco("endereco"+i);
        lista.add(p);
        
        }
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Salvar method, of class PessoaRepositorio.
     */
    @Test
    public void testSalvar()  {
        try {
            PessoaEntidade entidade=new PessoaEntidade();
            boolean expResult =true;
            boolean result = false;
        
   for (PessoaEntidade p : lista) {
        System.err.println("size "+lista.size()+" P:"+p.getNome());
         result = dao.Salvar(p);
        // TODO review the generated test code and remove the default call to fail.
       
     
        }
     
assertEquals(expResult, result);
   //   fail("The test case is a prototype.");
        } catch (Exception ex) {
            Logger.getLogger(PessoaRepositorioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }

    /**
     * Test of Alterar method, of class PessoaRepositorio.
     */
    @Test
    public void testAlterar() throws Exception {
        System.out.println("Alterar");
        
        List<PessoaEntidade> lista=dao.BuscarTodos();
 if (lista.size()>0) {
       
        PessoaEntidade obj = lista.get(lista.size()-1);
       
       PessoaEntidade obj2=new PessoaEntidade();
       obj2.setEmail(obj.getEmail());
       obj2.setNome(obj.getNome()+"2");
       obj2.setSobrenome(obj.getSobrenome());
       obj2.setEndereco(obj.getEndereco());
       obj2.setId(obj.getId());
       
        System.out.println(obj2.toString());
       dao.Alterar(obj2);
       obj=dao.buscarPeloId(obj.getId());
        System.out.println(obj.toString());
       assertEquals(obj, obj2);
 }
      
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of Deletar method, of class PessoaRepositorio.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("Deletar");
         List<PessoaEntidade> lista=dao.BuscarTodos();
         if (lista.size()>0) {
            
       PessoaEntidade obj = lista.get(lista.size()-1);
        dao.Deletar(obj.getId());
         PessoaEntidade p2=dao.buscarPeloId(obj.getId());
        assertNotEquals(obj, p2);
        
        }
      
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodos method, of class PessoaRepositorio.
     */
    @Test
    public void testListarTodos() throws Exception {
        System.out.println("listarTodos");
        List expResult = null;
        List result = dao.BuscarTodos();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testBuscarPeloId() throws Exception {
        System.out.println("BuscarPeloId");
       
        List<PessoaEntidade> expResult = dao.BuscarTodos();
         if (expResult.size()>0) {
       
        PessoaEntidade result = dao.buscarPeloId(expResult.get(expResult.size()-1).getId());
        assertNotEquals(expResult, result);
        
         }// TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
  
}
