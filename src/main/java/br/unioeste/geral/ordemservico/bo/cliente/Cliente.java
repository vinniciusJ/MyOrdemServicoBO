package br.unioeste.geral.ordemservico.bo.cliente;

import br.unioeste.geral.endereco.bo.enderecoespecifico.EnderecoEspecifico;
import br.unioeste.geral.pessoa.bo.email.Email;
import br.unioeste.geral.pessoa.bo.pessoafisica.PessoaFisica;
import br.unioeste.geral.pessoa.bo.telefone.Telefone;

import java.io.Serializable;
import java.util.List;

public class Cliente extends PessoaFisica implements Serializable {
    private Long id;

    public Cliente() {}

    public Cliente(String nome, String nomeSocial, EnderecoEspecifico endereco, List<Email> emails, List<Telefone> telefones, String primeiroNome, String nomeDoMeio, String ultimoNome, String cpf, Long id) {
        super(nome, nomeSocial, endereco, emails, telefones, primeiroNome, nomeDoMeio, ultimoNome, cpf);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
