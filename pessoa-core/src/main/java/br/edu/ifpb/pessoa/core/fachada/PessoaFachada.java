/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pessoa.core.fachada;

import br.edu.ifpb.pessoa.core.entidades.Pessoa;
import br.edu.ifpb.pessoa.core.persistencia.Pessoas;
import java.util.List;

/**
 *
 * @author José
 */
public class PessoaFachada {

    private Pessoas pessoas;

    public PessoaFachada() {
        this.pessoas = new Pessoas();
    }

    public boolean salvar(Pessoa pessoa) {
        return pessoas.salvar(pessoa);
    }

public List<Pessoa> listarTodos() {
        return pessoas.listarTodos();
    }

}
