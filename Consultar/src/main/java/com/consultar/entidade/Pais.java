package com.consultar.entidade;
// Generated 31/03/2017 19:48:10 by Hibernate Tools 4.3.1


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * PaisRepositorio generated by hbm2java
 */
@Entity
@Table(name="pais"
    ,catalog="consultar"
)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idpais")

public class Pais  implements java.io.Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pais_id_seq")
    @SequenceGenerator(
            name = "pais_id_seq",
            sequenceName = "pais_id_seq",
            allocationSize = 1)//de quanto em quanto ele incrementa

    @Column(name = "id")

     private Integer idpais;
    @NotNull
    @Column(name = "nome")
     private String nome;
    @NotNull
    @Column(name = "status")
     private Integer status;

//    @OneToMany(mappedBy = "pais",cascade = CascadeType.ALL)
//    private List<Estado> estado;

//    public Pais(String nome, Integer status, List<Estado> estado) {
//        this.setNome(nome);
//        this.setStatus(status);
//        this.setEstado(estado);
//
//    }


    public Integer getIdpais() {
        return idpais;
    }

    public void setIdpais(Integer idpais) {
        this.idpais = idpais;
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

//    public List<Estado> getEstado() {
//        return estado;
//    }
//
//    public void setEstado(List<Estado> estado) {
//        this.estado = estado;
//    }
}


