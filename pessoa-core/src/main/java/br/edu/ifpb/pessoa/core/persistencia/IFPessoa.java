/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pessoa.core.persistencia;

import br.edu.ifpb.pessoa.core.entidades.Pessoa;
import java.util.List;

/**
 *
 * @author José
 */
public interface IFPessoa {

    boolean salvar(Pessoa pessoa);

    List<Pessoa> listarTodos();

}
