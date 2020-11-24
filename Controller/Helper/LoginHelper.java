
package Controller.Helper;

import Model.Usuario;
import view.Login;

/**
 *
 * @author Michelle
 */
public class LoginHelper implements Ihelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo (){
     String nome = view.getTextUsuario().getText();
     String senha = view.getTextSenha().getText();
     Usuario modelo = new Usuario (senha, 0, nome); 
     return modelo;
    }
    
    public void setarModelo (Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(nome);
    }
    
    public void limparTela (){
        view.getTextUsuario().setText(" ");
        view.getTextSenha().setText(" ");
    }
}
