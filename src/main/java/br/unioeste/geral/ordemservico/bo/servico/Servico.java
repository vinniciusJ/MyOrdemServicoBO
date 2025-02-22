package br.unioeste.geral.ordemservico.bo.servico;

import br.unioeste.geral.ordemservico.bo.tiposervico.TipoServico;

import java.io.Serializable;

public class Servico implements Serializable {
    private Long id;
    private Double valorCobrado;
    private TipoServico tipoServico;

    public Servico() {}

    public Servico(Long id, Double valorCobrado, TipoServico tipoServico) {
        this.id = id;
        this.valorCobrado = valorCobrado;
        this.tipoServico = tipoServico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(Double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }
}
