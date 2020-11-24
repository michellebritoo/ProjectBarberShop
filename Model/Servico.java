
package Model;

/**
 *
 * @author Michelle
 */
public class Servico {
    
    private int id;
    private String Descricao;
    private double valor;

    
    
    public Servico (int id, String Desc, float Valor){
        this.id = id;
        this.Descricao = Desc;
        this.valor = Valor;
        //Servico servico1 = new Servico(1, "Corte Simples", 18);
    }


    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    // hello wrold, tudo certinho por ai?
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
@Override
 public String toString (){
     return getDescricao ();
     
 }
  
}
