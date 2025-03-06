package br.unioeste.geral.ordemservico.bo.ordemservico;

import br.unioeste.geral.ordemservico.bo.cliente.Cliente;
import br.unioeste.geral.ordemservico.bo.funcionario.Funcionario;
import br.unioeste.geral.ordemservico.bo.servico.Servico;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class OrdemServico implements Serializable {
    private String numero;
    private LocalDate dataEmissao;
    private String descricao;
    private Cliente cliente;
    private Funcionario funcionarioResponsavel;
    private List<Servico> servicosRealizados;
    private Double valorTotal;

    public OrdemServico() {}

    public OrdemServico(String numero, LocalDate dataEmissao, String descricao, Cliente cliente, Funcionario funcionarioResponsavel, List<Servico> servicosRealizados) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.descricao = descricao;
        this.cliente = cliente;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.servicosRealizados = servicosRealizados;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Servico> getServicosRealizados() {
        return servicosRealizados;
    }

    public void setServicosRealizados(List<Servico> servicosRealizados) {
        this.servicosRealizados = servicosRealizados;
    }
}
