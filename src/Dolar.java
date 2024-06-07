public class Dolar extends Moeda {

    public Dolar(double valorIncial) {
        this.valor = valorIncial;
    }

    public void info() {
        System.out.println("Dolar - " + valor);

    }

    public double converter() {
        return this.valor * 5.3;

    }
}

