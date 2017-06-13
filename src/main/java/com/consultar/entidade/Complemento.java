package com.consultar.entidade;
// Generated 31/03/2017 19:48:10 by Hibernate Tools 4.3.1


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * ComplementoRepositorio generated by hbm2java
 */
@Entity
@Table(name="complemento"
    ,catalog="consultar"
)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idcomplemento")

public class Complemento  implements java.io.Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "complemento_id_seq")
    @SequenceGenerator(
            name = "complemento_id_seq",
            sequenceName = "complemento_id_seq",
            allocationSize = 1)//de quanto em quanto ele incrementa

    @Column(name = "id_complemento")

     private Integer idcomplemento;
    @NotNull
    @Column(name = "descricao")
     private String descricao;
    @NotNull
    @Column(name = "status")
     private Integer status;




//    public Complemento(String descricao, String status) {
//        this.setDescricao(descricao);
//        this.setStatus(status);
//    }




    public Integer getIdcomplemento() {
        return idcomplemento;
    }

    public void setIdcomplemento(Integer idcomplemento) {
        this.idcomplemento = idcomplemento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

