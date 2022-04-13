package com.aplicacao.anuncios.domain.enums;

import javax.persistence.criteria.CriteriaBuilder;

public enum TipoCliente {

    PESSOAFISICA(1,"PF"),
    PESSOAJURIDICA(2,"PJ");

    private Integer id;
    private String descricao;

    private TipoCliente(Integer id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
    public Integer getId(){ return this.id;}
    public String getDescricao(){return this.descricao;}

    public static TipoCliente toEnum(Integer id){
        if (id == null){
            return null;
        }
        for (TipoCliente x : TipoCliente.values()){
            if (id.equals(x.getId())){
                return x;
            }
        }
        throw new IllegalArgumentException("ID inválido");
    }

}
