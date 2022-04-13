package com.aplicacao.anuncios.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String estado;

    @JsonIgnore
    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades = new ArrayList<>();

    public Estado () {};
    public Estado (Integer id, String estado){
        this.id = id;
        this.estado = estado;
    }
    public Integer getId(){
        return this.id;
    }
    public String getEstado(){
        return this.estado;
    }
    public List<Cidade> getCidades(){ return this.cidades;}
    public void setCidades(List<Cidade> cidades){ this.cidades = cidades;}
    public void setId(Integer id){
        this.id = id;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estado)) return false;
        Estado estado1 = (Estado) o;
        return Objects.equals(getId(), estado1.getId()) && Objects.equals(getEstado(), estado1.getEstado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEstado());
    }
}
