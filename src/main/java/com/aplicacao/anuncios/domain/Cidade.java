package com.aplicacao.anuncios.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cidade;


    @ManyToOne
    @JoinColumn(name = "idestado")
    private Estado estado;

    public Cidade(){}
    public Cidade(Integer id, String cidade,Estado estado){
        super();
        this.id = id;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void setId (Integer id){
        this.id = id;
    }
    public void setCidade (String cidade){
        this.cidade = cidade;
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public Integer getId(){
        return this.id;
    }

    public String getCidade(){
        return this.cidade;
    }
    public Estado getEstado(){
        return this.estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cidade)) return false;
        Cidade cidade1 = (Cidade) o;
        return Objects.equals(getId(), cidade1.getId()) && Objects.equals(getCidade(), cidade1.getCidade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCidade());
    }
}
