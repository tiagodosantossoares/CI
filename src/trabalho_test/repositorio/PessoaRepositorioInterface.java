/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_test.repositorio;

import java.util.List;
import trabalho_test.entidade.PessoaEntidade;

/**
 *
 * @author tiago
 */
public interface PessoaRepositorioInterface {
    public boolean Salvar(PessoaEntidade en);
    public boolean Alterar(PessoaEntidade en);
    public boolean Deletar(int id);
    public List<PessoaEntidade> BuscarTodos();
    public PessoaEntidade buscarPeloId(int id);
    
    
}
