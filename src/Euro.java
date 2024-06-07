public class Euro extends Moeda {

    public Euro(double valorIncial) {
        this.valor = valorIncial;
    }

    public void info() {
        System.out.println("Euro - " + valor);

    }

    public double converter() {
        return this.valor * 5.7;

    }
}


