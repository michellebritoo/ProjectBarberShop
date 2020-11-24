
package view;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;

/**
 *
 * @author Michelle
 */
public class Main {
    
    public static void main (String [] args){
    
     Servico servico = new Servico (01,"Barba", 30);
     Cliente cliente = new Cliente ("celeste", "93700-000", 001, "ANDRÉ");
    
    Agendamento agendamento = new Agendamento (1, cliente, servico, 30,"12/04/2020 09:30");
    
    
    }
    
    
}
