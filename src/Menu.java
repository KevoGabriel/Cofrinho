import java.util.Scanner;

public class Menu {

    private Scanner sc;

    public Menu() { 
        sc = new Scanner(System.in);

    }
        public void exibirMenuPrincipal() {
            System.out.println("COFRINHO");
            System.out.println("1-Adicionar moeda");
            System.out.println("2-Remover moeda");
            System.out.println("3-Listar moeda");
            System.out.println("4-Calcular valor total convertido para real");
            System.out.println("0-Encerrar");

            String opcaoSelecao = sc.next();

            System.out.println(opcaoSelecao);

            switch (opcaoSelecao) {
                case "0":
                    System.out.println("Sistema encerrado.");
                    break;
                
                default:
                    System.out.println("Opção inválida");
                    exibirMenuPrincipal();
                    break;
        }
    }
}
