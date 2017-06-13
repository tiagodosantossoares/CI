/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.integracaocontinua.controler;

import java.util.ArrayList;
import java.util.List;

import com.integracaocontinua.entidade.PessoaEntidade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tiago
 */
public class PessoaControladorTest {
    
    PessoaControlador controlador;
    public PessoaControladorTest() {
    controlador=new PessoaControlador();
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
     * Test of Salvar method, of class PessoaControlador.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("Salvar");
    
        PessoaEntidade p=new PessoaEntidade();
        p.setNome("nome1223");
        p.setSobrenome("sobrenome123");
        p.setEmail("email123");
        p.setEndereco("endereco");
        boolean res=controlador.Salvar(p);
        Assert.assertEquals(true, res);
         boolean res2=controlador.Salvar(p);
        Assert.assertEquals(false, res2);
        
        }
        
        
    

    /**
     * Test of Alterar method, of class PessoaControlador.
     */
    @Test
    public void testAlterar() throws Exception {
        System.out.println("Alterar");
        
        List<PessoaEntidade> lista=controlador.buscarTodos();
         if (lista.size()>0) {
      
        PessoaEntidade obj = lista.get(lista.size()-1);
       
       PessoaEntidade obj2=new PessoaEntidade();
       obj2.setEmail(obj.getEmail());
       obj2.setNome(obj.getNome()+"alterado");
       obj2.setSobrenome(obj.getSobrenome());
       obj2.setEndereco(obj.getEndereco());
       obj2.setId(obj.getId());
       
        System.out.println(obj2.toString());
       controlador.Alterar(obj2);
       obj=controlador.buscarPeloId(obj.getId());
        System.out.println(obj.toString());
      
       assertEquals(obj, obj2);
         }  
    
    }

    /**
     * Test of Deletar method, of class PessoaControlador.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("Deletar");
        List<PessoaEntidade> lista=controlador.buscarTodos();
        
        assertEquals(false, controlador.Deletar(0));
           if (lista.size()>0) {
      
        assertEquals(true, controlador.Deletar(lista.get(lista.size()-1).getId()));        

           }// TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarTodos method, of class PessoaControlador.
     */
    @Test
    public void testBuscarTodos() throws Exception {
        System.out.println("buscarTodos");
        List<PessoaEntidade> expResult = controlador.buscarTodos();
        assertNotEquals(expResult, null);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarPeloId method, of class PessoaControlador.
     */
    @Test
    public void testBuscarPeloId() throws Exception {
        System.out.println("buscarPeloId");
        List<PessoaEntidade> p=controlador.buscarTodos();
           if (p.size()>0) {
      
        int id = p.get(0).getId();
        PessoaEntidade expResult = null;
        PessoaEntidade result = controlador.buscarPeloId(id);
        assertNotEquals(expResult, result);
        
           }
    }
    
}
