
import br.edu.ifpb.pessoa.core.entidades.Pessoa;
import br.edu.ifpb.pessoa.core.persistencia.Pessoas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José
 */
public class NewClass {
    public static void main(String[] args) {
        Pessoa p =new Pessoa("pedro");
        Pessoas dao = new Pessoas();
        boolean f = dao.salvar(p);
        System.err.println("salvo "+f);
    }
}
