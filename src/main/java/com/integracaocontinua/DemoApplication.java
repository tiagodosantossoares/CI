package com.integracaocontinua;

import com.integracaocontinua.entidade.PessoaEntidade;
import com.integracaocontinua.repositorio.PessoaRepositorio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		try {
			// TODO code application logic here

			PessoaRepositorio dao=new PessoaRepositorio<Object>();
			PessoaEntidade entidade=new PessoaEntidade();
			entidade.setNome("teste");
			entidade.setEmail("email");
			entidade.setSobrenome("sobrenome");
			entidade.setEndereco("teste");

			dao.Salvar(entidade);
		} catch (Exception ex) {
		//	Logger.getLogger(Trabalho_Test.class.getName()).log(Level.SEVERE, null, ex);
		}

		SpringApplication.run(DemoApplication.class, args);
	}
}
