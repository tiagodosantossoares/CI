/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_test;

import java.util.logging.Level;
import java.util.logging.Logger;
import trabalho_test.entidade.PessoaEntidade;
import trabalho_test.repositorio.PessoaRepositorio;

/**
 *
 * @author tiago
 */
public class Trabalho_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            PessoaRepositorio<PessoaEntidade> dao=new PessoaRepositorio<>();
            PessoaEntidade entidade=new PessoaEntidade();
            entidade.setNome("teste");
            entidade.setEmail("email");
            entidade.setSobrenome("sobrenome");
            entidade.setEndereco("teste");
            
            dao.Salvar(entidade);
        } catch (Exception ex) {
            Logger.getLogger(Trabalho_Test.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    
}
