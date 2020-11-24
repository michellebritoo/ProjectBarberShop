
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;


public class AgendaHelper implements Ihelper {
  
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
       
        //jTable1 = tabela (nome)
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();
        tableModel.setNumRows(0);
        
        //percorrer e preencher table model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object [] {
            agendamento.getId(),
            agendamento.getCliente().getNome(),
            agendamento.getServico().getDescricao(),
            agendamento.getValor(),
            agendamento.getDataFormatada(),
            agendamento.getHoraFormatada(),
            agendamento.getObservacao()
            
            
            });
            
       
        }
       
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
      for (Cliente cliente : clientes){
          comboBoxModel.addElement(cliente); // aqui ta o truque
      }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
       
       for (Servico servico : servicos){
          comboBoxModel.addElement(servico); // aqui ta o truque
      }
    }

    public Cliente obterCliente() {
        return (Cliente) view.getjComboBoxCliente().getSelectedItem();
    }
    
    
    public Servico obterServico() {
        return (Servico) view.getjComboBoxServico().getSelectedItem();
    }

    public void SetarValor(double valor) {
       view.getjTextFieldValor().setText(valor + "");   //concatenação: toda a operação vira string
    }

    
    
    
    
    @Override
    public Agendamento obterModelo() {
        String IdString = view.getjTextFieldID().getText();
        int id = Integer.parseInt(IdString);
        Cliente cliente = obterCliente ();
        Servico servico = obterServico ();
        
        String valorString = view.getjTextFieldValor().getText();
        float valor = Float.parseFloat(valorString);
        
       String data = view.getjTextFieldData().getText();
       String hora = view.getjTextFieldHora().getText();
       String dataHora = data + " " + hora;
       
       String observacao = view.getjTextAreaOBS().getText();
       
       Agendamento agendamento = new Agendamento (id, cliente, servico, valor, dataHora, observacao);
       return agendamento;
    }

    @Override
    public void limparTela() {
       view.getjTextFieldID().setText(" ");
       view.getjTextAreaOBS().setText(" ");
       view.getjTextFieldData().setText(" ");
       view.getjTextFieldHora().setText(" ");
       
    }

    
    
    
}
