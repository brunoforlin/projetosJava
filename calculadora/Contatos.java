import java.util.ArrayList;

public class Contatos {
     private ArrayList<Contato> contatos;

     public Contatos() {
        this.contatos = new ArrayList<Contato>();

     
     }

     public void adicionar (String nome, String numero){
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);

     }

     
}
