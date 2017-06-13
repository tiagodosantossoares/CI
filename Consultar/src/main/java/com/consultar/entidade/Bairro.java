package com.consultar.entidade;
// Generated 31/03/2017 19:48:10 by Hibernate Tools 4.3.1


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * BairroRepositorio generated by hbm2java
 */
@Entity
@Table(name="bairro"
    ,catalog="consultar"
)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idbairro")

public class Bairro  implements java.io.Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "bairro_id_seq")
    @SequenceGenerator(
            name = "bairro_id_seq",
            sequenceName = "bairro_id_seq",
            allocationSize = 1)//de quanto em quanto ele incrementa

    @Column(name = "id")

     private Integer idbairro;
    @NotNull
    @Column(name = "nome")
     private String nome;
    @NotNull
    @Column(name = "status")
     private Integer status;
    @NotNull

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cidade_id")
     private Cidade cidade;



//    public Bairro(String nome, Integer status, Cidade cidade, List<Endereco> endereco) {
//        this.setNome(nome);
//        this.setStatus(status);
//        this.setCidade(cidade);
//        this.setEndereco(endereco);
//    }


    public Integer getIdbairro() {
        return idbairro;
    }

    public void setIdbairro(Integer idbairro) {
        this.idbairro = idbairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }


}

