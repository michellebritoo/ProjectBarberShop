
package Model;

import java.util.Date;

/**
 *
 * @author Monique
 */
public class Usuario extends Pessoa {
    
    
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome, char sexo, String DataNascimento, String telefone, String email, String RG,String senha, String nivelAcesso) {
        super(id, nome, sexo, DataNascimento, telefone, email, RG);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String senha,int id, String nome) { //String nivelAcesso
        super(id, nome);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    

    
    
    
}
