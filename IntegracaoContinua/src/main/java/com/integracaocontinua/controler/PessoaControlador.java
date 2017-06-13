/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.integracaocontinua.controler;

import com.integracaocontinua.entidade.PessoaEntidade;
import com.integracaocontinua.repositorio.PessoaRepositorio;
import com.integracaocontinua.repositorio.PessoaRepositorioInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiago
 */
public class PessoaControlador
{
    private PessoaRepositorioInterface pessoaRepositorio;

    public PessoaControlador(PessoaRepositorioInterface p) {
        
        pessoaRepositorio=p;
	   }
    public PessoaControlador() {
        if (pessoaRepositorio==null) {
            
        pessoaRepositorio=new PessoaRepositorio<>();
	
        }   
        }
    public boolean Salvar( PessoaEntidade obj ) throws Exception
    {
       List<PessoaEntidade> p=pessoaRepositorio.BuscarTodos();
      for (PessoaEntidade pessoaEntidade : p) {
            if(pessoaEntidade.getNome().equals(obj.getNome())){
            return false;
            
            }
        }
        
        
        return pessoaRepositorio.Salvar(obj);
    }
    public boolean Alterar( PessoaEntidade obj ) throws Exception
    {       if (obj != null) {
            
        
            
            return  pessoaRepositorio.Alterar(obj);
            }else{return false;}
    }
    public boolean Deletar(int id) throws Exception
    {
        if (id>0) {
            if (pessoaRepositorio.Deletar(id)) {
                return true;
            }else{return false;}
        }
            return false;
    }
    public List<PessoaEntidade> buscarTodos() throws Exception
    {
        List<PessoaEntidade> lista=pessoaRepositorio.BuscarTodos();
        if (lista==null) {
            return new ArrayList<PessoaEntidade>();
        }
        return lista;
    }
     public PessoaEntidade buscarPeloId(int id) throws Exception
    {
        
        return pessoaRepositorio.buscarPeloId(id);
    }
  
}
