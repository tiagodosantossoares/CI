/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_test.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import trabalho_test.entidade.PessoaEntidade;

/**
 *
 * @author tiago
 */
public class PessoaRepositorio<T> implements PessoaRepositorioInterface
{
    private GenericDAO<PessoaEntidade> dao;

    public PessoaRepositorio() {
        System.out.println("trabalho_test.repositorio.PessoaRepositorio.<init>()");
        dao=new GenericDAO<>();
	   }
     @Override
    public boolean Salvar( PessoaEntidade obj ) 
    {
           
        try {
            dao.objInserir(obj);
            
           
        } catch (Exception ex) {
            return false;
        }
         return true;
    }
     @Override
    public boolean Alterar( PessoaEntidade obj ) 
    {
        try {
            dao.objAlterar(obj);
           
        } catch (Exception ex) {
        return  false;
        }
         return  true;
    }
    @Override
    public boolean Deletar(int id) 
    {
        try {
            PessoaEntidade p=(PessoaEntidade)dao.buscarPeloId(new PessoaEntidade(),id);
            dao.objDeletar(p);
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(PessoaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        
        return false;
        }
        return true;
    }
    @Override
    public List<PessoaEntidade> BuscarTodos()
    {
        try {
            return dao.listar(new PessoaEntidade());
        } catch (Exception ex) {
            Logger.getLogger(PessoaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public PessoaEntidade buscarPeloId(int id)
    {
        try {
            return (PessoaEntidade)dao.buscarPeloId(new PessoaEntidade(),id);
        } catch (Exception ex) {
            Logger.getLogger(PessoaRepositorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


  
}
