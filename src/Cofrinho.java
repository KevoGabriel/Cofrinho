import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

    public void listagemMoedas() {
        if (this.listaMoedas.isEmpty()) {
            System.out.println("Não há moedas no cofrinho!");
            return;
        }
        
        for (Moeda moeda : this.listaMoedas) {
            moeda.info();
        }
    }
}
