
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import java.util.ArrayList;
import view.Agenda;


public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper (this.view);
    }
    
    public void atualizaTabela ( ) {
        //buscar uma lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO ();
        ArrayList <Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        // exibir lista na tela (view)
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaCliente (){
        // buscar clientes do banco de dados
        ClienteDAO clienteDAO = new ClienteDAO ();
        ArrayList <Cliente> clientes = clienteDAO.selectAll();
        
        //exibir clientes no combobox
        helper.preencherClientes (clientes);
        
    }
    
   public void atualizaServico (){
       ServicoDAO servicoDAO = new ServicoDAO ();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos (servicos);
   }
   
   public void atualizaValor (){
       Servico servico = helper.obterServico ();
       helper.SetarValor (servico.getValor ());
   }

    public void agendar() {
        // buscar objeto na tela
        Agendamento agendamento = helper.obterModelo();
        //inserir no banco de dados
        new AgendamentoDAO ().insert(agendamento);
        //atualizar a tabela
       atualizaTabela ();
       this.helper.limparTela();
        
    }
   
   
}
