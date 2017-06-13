/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_test.repositorio;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import trabalho_test.entidade.PessoaEntidade;

/**
 *
 * @author tiago
 */
public class GenericDAO<T>
{
    private static Session sessao;
    private Transaction transacao;

    public void initSessao(){
    if (sessao == null || !sessao.isOpen()) 
		try {

		NewHibernateUtil hibernateUtil=new NewHibernateUtil();
			sessao =hibernateUtil.getSessionFactory().openSession();
            

		} catch (Exception e) {
			// TODO: handle exception
			sessao.getTransaction().rollback();
			
			e.printStackTrace();
			
		}}
    public GenericDAO() {
        System.out.println("trabalho_test.repositorio.GenericDAO.<init>()");
    initSessao();
 }
    /** Creates a new instance of GenericDAO */
    
    
    public void objInserir( Object obj ) throws Exception
    {
           initSessao();
        
   
        
            transacao = sessao.beginTransaction();
            sessao.save(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public void objAlterar( Object obj ) throws Exception
    {
 initSessao();
        transacao = sessao.beginTransaction();
            sessao.update(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public void objDeletar( Object obj ) throws Exception
    {
         initSessao();
            transacao = sessao.beginTransaction();
            sessao.delete(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }
    public List<T> listar(T t) throws Exception
    { initSessao();
        
        transacao = sessao.beginTransaction();
        List objts;
        objts = null;
        Criteria selectAll = sessao.createCriteria(t.getClass());
        transacao.commit();
        objts = selectAll.list();
        sessao.close();
        return objts;
    }
 //    public Object listar(Class clazz, String pk) throws Exception
 //   {
 //       transacao = sessao.beginTransaction();
        //Fornecedor objt = (Fornecedor) sessao.load(clazz, new Integer(Integer.parseInt(pk)) );
 //       transacao.commit();
 //       sessao.flush();
  //      sessao.close();
  //      return objt;
  //  }
    
    public Object buscarPeloId(T t,int id) throws Exception
    {
         initSessao();
        transacao = sessao.beginTransaction();
        List objts;
        objts = null;
        Criteria selectAll = sessao.createCriteria(t.getClass());
        selectAll.add(Restrictions.like("id", id));
        transacao.commit();
        Object p = (PessoaEntidade)selectAll.uniqueResult();
                sessao.close();
        return p;
    }
    public Object buscar(T t,String nome) throws Exception
    {
         initSessao();
        transacao = sessao.beginTransaction();
        List objts;
        objts = null;
        Criteria selectAll = sessao.createCriteria(t.getClass());
        selectAll.add(Restrictions.like("nome", nome));
        transacao.commit();
        Object p = (PessoaEntidade)selectAll.uniqueResult();
                sessao.close();
        return p;
    }
    
    public void rollBack()
    {
        transacao.rollback();
        sessao.close();
    }
    public void closeConnection() throws Exception
    {
            sessao = (Session) NewHibernateUtil.getSessionFactory();
            sessao.close();
    }
}
