public class Real extends Moeda {

    public Real(double valorIncial) {
        this.valor = valorIncial;
    }

        public void info() {
            System.out.println("Real - " + valor);

        }

        public double converter() {
            return this.valor;

        }
}