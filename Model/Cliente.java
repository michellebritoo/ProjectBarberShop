
package Model;

import java.util.Date;

/**
 *
 * @author Monique
 */
public class Cliente extends Pessoa {
    
    private String endereco;
    private String CEP;

   
    public Cliente(int id, String nome, char sexo, String DataNascimento, String telefone, String email, String RG, String endereco, String CEP) {
        super(id, nome, sexo, DataNascimento, telefone, email, RG);
        this.endereco = endereco;
        this.CEP = CEP;
    }

    public Cliente(String endereco, String CEP, int id, String nome) {
        super(id, nome);
        this.endereco = endereco;
        this.CEP = CEP;
    }

    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

 @Override
 public String toString (){
     return getNome ();
     
 }
    
    
}
