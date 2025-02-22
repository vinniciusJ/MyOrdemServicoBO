package br.unioeste.geral.ordemservico.bo.tiposervico;

import java.io.Serializable;

public class TipoServico implements Serializable {
    private Long id;
    private String nome;
    private Double valorReferencia;

    public TipoServico() {}

    public TipoServico(Long id, String nome, Double valorReferencia) {
        this.id = id;
        this.nome = nome;
        this.valorReferencia = valorReferencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorReferencia() {
        return valorReferencia;
    }

    public void setValorReferencia(Double valorReferencia) {
        this.valorReferencia = valorReferencia;
    }
}
