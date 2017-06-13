package com.consultar.entidade;
// Generated 31/03/2017 19:48:10 by Hibernate Tools 4.3.1


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * LocalizacaoRepositorio generated by hbm2java
 */
@Entity
@Table(name="endereco"
    ,catalog="consultar"
)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idendereco")

public class Endereco implements java.io.Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "endereco_id_seq")
    @SequenceGenerator(
            name = "endereco_id_seq",
            sequenceName = "endereco_id_seq",
            allocationSize = 1)//de quanto em quanto ele incrementa

    @Column(name = "id_endereco")

     private Integer idendereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_complemento")
    private Complemento complemento;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rua_id")
    private Rua rua;

    @NotNull
    @Column(name = "status")
    private Integer status;


    @NotNull
    @Column(name = "latitude")
    private String latitude;
    @NotNull
    @Column(name = "longitude")
    private String longitude;





    public Integer getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Integer idendereco) {
        this.idendereco = idendereco;
    }

    public Complemento getComplemento() {
        return complemento;
    }

    public void setComplemento(Complemento complemento) {
        this.complemento = complemento;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }
}


