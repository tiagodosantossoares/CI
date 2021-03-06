package com.consultar.entidade;
// Generated 31/03/2017 19:48:10 by Hibernate Tools 4.3.1


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * UnidadeDeSaudeRepositorio generated by hbm2java
 */
@Entity
@Table(name="unidade_de_saude"
    ,catalog="consultar"
)
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idunidadeDeSaude")

public class UnidadeDeSaude  implements java.io.Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "unidade_de_saude_id_seq")
    @SequenceGenerator(
            name = "unidade_de_saude_id_seq",
            sequenceName = "unidade_de_saude_id_seq",
            allocationSize = 1)//de quanto em quanto ele incrementa

    @Column(name ="unidade_saude_id")


     private Integer idunidadeDeSaude;
    @NotNull
    @Column(name = "nome")
     private String nome;
    @NotNull
    @Column(name = "horario")
     private String horario;
    @NotNull
    @Column(name = "status")
     private Integer status;


    @Column(name = "descricao",length = 1000    )
    private String descricao;
    @NotNull
    @Column(name = "url",length=1000)
    private String url;



    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "unidade_saude_vacina",
            joinColumns=@JoinColumn(name = "unidade_de_saude_id"),
            inverseJoinColumns=@JoinColumn(name = "vacina_id"))
   // @JsonManagedReference(value = "unidade_saude_vacina")

    private List<Vacinas> vacinas;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "unidade_saude_medicamento",
            joinColumns=@JoinColumn(name = "unidade_de_saude_id"),
            inverseJoinColumns=@JoinColumn(name = "medicamento_id"))
//    @JsonManagedReference(value = "unidade_saude_medicamento")


    private List<Medicamento> medicamento;



    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "unidade_saude_imagem")
    private Imagem imagem;


    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "unidade_saude_contato")
    private Contato contato;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "unidade_de_saude_exame",
            joinColumns=@JoinColumn(name = "unidade_de_saude_id"),
            inverseJoinColumns=@JoinColumn(name = "exame_id"))
  //  @JsonManagedReference(value = "unidade_de_saude_exame")
    private List<Exames> exames;
@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "unidade_de_saude_profissional",
            joinColumns=@JoinColumn(name = "unidade_de_saude_id"),
            inverseJoinColumns=@JoinColumn(name = "profissional_id"))
  //  @JsonManagedReference(value = "unidade_de_saude_exame")
    private List<Profissional> profissional;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "unidade_de_saude_plantao_dia",
            joinColumns=@JoinColumn(name = "unidade_de_saude_id"),
            inverseJoinColumns=@JoinColumn(name = "plantao_dia_id"))
    private List<PlantaoDia> plantaoDia;

//    @OneToMany(mappedBy = "unidadeDeSaude",cascade=CascadeType.ALL)
//    private List<Leito> leito;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private  Usuario usuario;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private  Endereco endereco;


    public List<PlantaoDia> getPlantaoDia() {
        return plantaoDia;
    }

    public void setPlantaoDia(List<PlantaoDia> plantaoDia) {
        this.plantaoDia = plantaoDia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Profissional> getProfissional() {
        return profissional;
    }

    public void setProfissional(List<Profissional> profissional) {
        this.profissional = profissional;
    }

//    public List<Leito> getLeito() {
//        return leito;
//    }
//
//    public void setLeito(List<Leito> leito) {
//        this.leito = leito;
//    }

    public Integer  getIdunidadeDeSaude() {
        return idunidadeDeSaude;
    }

    public void setIdunidadeDeSaude(Integer idunidadeDeSaude) {
        this.idunidadeDeSaude = idunidadeDeSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Vacinas> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<Vacinas> vacinas) {
        this.vacinas = vacinas;
    }

    public List<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }


    public List<Exames> getExames() {
        return exames;
    }

    public void setExames(List<Exames> exames) {
        this.exames = exames;
    }

//    public List<Leito> getLeitos() {
//        return leito;
//    }
//
//    public void setLeitos(List<Leito> leitos) {
//        this.leito = leitos;
//    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


