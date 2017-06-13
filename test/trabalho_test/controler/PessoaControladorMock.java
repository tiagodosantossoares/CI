/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_test.controler;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import org.mockito.runners.MockitoJUnitRunner;
import trabalho_test.entidade.PessoaEntidade;
import trabalho_test.repositorio.PessoaRepositorioInterface;
/**
 *
 * @author tiago
 */
@RunWith(MockitoJUnitRunner.class)
public class PessoaControladorMock {
    
    List<PessoaEntidade> lista=new ArrayList<>();
        
@InjectMocks
PessoaControlador controlador;

@Mock
private PessoaRepositorioInterface pessoaRepositorio;

PessoaEntidade pessoa;


@Before
  public void setup() {
      MockitoAnnotations.initMocks(this);
//pessoaRepositorio=Mockito.mock(PessoaRepositorio.class);
controlador=new PessoaControlador(pessoaRepositorio);
  }
@Before
   public void init(){
        for (int i = 0; i < 10; i++) {
        pessoa=new PessoaEntidade();
        pessoa.setId(i);
        pessoa.setNome("nome"+i);
        pessoa.setEmail("email"+i);
        pessoa.setEndereco("endereco"+i);
        pessoa.setSobrenome("sobrenome"+i);
        lista.add(pessoa);
    }
        
        
     }

    /**
     * Test of Salvar method, of class PessoaControlador.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("Salvar");
        PessoaEntidade obj = new PessoaEntidade();
        obj.setNome("mock2");
        obj.setSobrenome("sobrenome1");
        obj.setEmail("email1");
        obj.setEndereco("endereco1");
        when(pessoaRepositorio.BuscarTodos()).thenReturn(lista);
        when(pessoaRepositorio.Salvar(any(PessoaEntidade.class))).thenReturn(true);
         
        boolean expResult = true;
        boolean result = controlador.Salvar(obj);
        
        assertEquals(expResult, result);
    }
@Test
    public void testAlterar() throws Exception {
        System.out.println("Alterar");
        
          when(pessoaRepositorio.Alterar(any(PessoaEntidade.class))).thenReturn(true);
       
       PessoaEntidade obj2=new PessoaEntidade();
       obj2.setEmail("email-Alterado");
       obj2.setNome("Nome-alterado");
       obj2.setSobrenome("sobrenome-alterado");
       obj2.setEndereco("endereco-Alterado");
       obj2.setId(1);
       
       boolean alt=  controlador.Alterar(obj2);
     
       System.err.println("alterar:"+alt);
       assertEquals(alt, true);
           
    
    }

    /**
     * Test of Deletar method, of class PessoaControlador.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("Deletar");
           when(pessoaRepositorio.Deletar(1)).thenReturn(true);   
        assertEquals(false, controlador.Deletar(0));
        
        assertEquals(true, controlador.Deletar(1));
          
        
    }

    /**
     * Test of buscarTodos method, of class PessoaControlador.
     */
    @Test
    public void testBuscarTodos() throws Exception {
        System.out.println("buscarTodos");
        
         when(pessoaRepositorio.BuscarTodos()).thenReturn(lista);
       
        
        List<PessoaEntidade> expResult = controlador.buscarTodos();
        System.out.println(expResult.size());
        assertNotEquals(expResult, null);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarPeloId method, of class PessoaControlador.
     */
    @Test
    public void testBuscarPeloId() throws Exception {
        System.out.println("buscarPeloId");
        
         PessoaEntidade obj = new PessoaEntidade();
        obj.setNome("mock1");
        obj.setSobrenome("sobrenome1");
        obj.setEmail("email1");
        obj.setEndereco("endereco1");
      
        when(pessoaRepositorio.buscarPeloId(1)).thenReturn(obj);
       
        
        PessoaEntidade expResult = null;
        PessoaEntidade result = controlador.buscarPeloId(1);
        System.out.println(result.toString());
        assertNotEquals(expResult, result);
        assertEquals(obj, result);
         PessoaEntidade result2 = controlador.buscarPeloId(0);
        System.out.println(result2);
        
        assertEquals(null, result2);
        
           }
    }
//    

