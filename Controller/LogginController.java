
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 * essa classe serve para criar regras de negócio e toda a lógica do sistema
 * @author Michelle
 */
public class LogginController {

    private final Login view;
    private LoginHelper helper;

    public LogginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper (view);
    }
    
    
    
    public void entrarNoSistema (){
        //pegar um usuario da view
        Usuario usuario = helper.obterModelo();
        
        //pesquisar usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO ();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //se o usuario da view tiver o mesmo nome e senha do usuario no banco -> direcionar para o menu principal
        if (usuarioAutenticado != null){
            //navegat para o menu
            MenuPrincipal menuPrincipal = new MenuPrincipal ();
            menuPrincipal.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou senha inválidos");
        }
    }
     
    //pesquisar usuário no banco
    //se o usuario da view tiver o mesmo nome e senha que o usuario vindo do banco de dados, redirecionar
    // senão mostrar "usuário ou senha inválidos"
}
