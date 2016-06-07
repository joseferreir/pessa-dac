/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pessoa.web.servico;

import br.edu.ifpb.pessoa.core.entidades.Pessoa;
import br.edu.ifpb.pessoa.core.fachada.PessoaFachada;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author José
 */
@Named
@RequestScoped
public class servico {

    private Pessoa pessoa = new Pessoa();

    public servico() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> lista() {
        PessoaFachada fachada = new PessoaFachada();
        return fachada.listarTodos();

    }

    public String salvar() {
        PessoaFachada fachada = new PessoaFachada();
        boolean resultado = fachada.salvar(pessoa);
        if (resultado) {
            return "home";
        }
        return "erro";
    }

}
