package com.consultar.entidade;
// Generated 31/03/2017 19:48:10 by Hibernate Tools 4.3.1



import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * EstadoRepositorio generated by hbm2java
 */
@Entity
@Table(name="estado"
    ,catalog="consultar"
)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idestado")

public class Estado  implements java.io.Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "estado_id_seq")
    @SequenceGenerator(
            name = "estado_id_seq",
            sequenceName = "estado_id_seq",
            allocationSize = 1)//de quanto em quanto ele incrementa

    @Column(name = "id")

     private Integer idestado;
    @NotNull
    @Column(name = "nome")
     private String nome;
    @NotNull
    @Column(name = "status")
     private Integer status;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pais")
     private Pais pais;


    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
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

   }


