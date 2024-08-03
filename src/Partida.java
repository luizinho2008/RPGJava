import java.util.Scanner;

public class Partida {
    public void iniciarPartida() {

        Integer opcao;
        Scanner sc = new Scanner(System.in);
        GerenciadorPersonagens gerence = new GerenciadorPersonagens();

        do {
            System.out.println("\n========== Legends of Thalion =============");

            System.out.println("\nEscolha uma opção: ");

            System.out.println("\n1. Criar personagem");
            System.out.println("2. Listar personagens");
            System.out.println("3. Adicionar item ao personagem");
            System.out.println("4. Sair\n");

            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    gerence.criarPersonagem();
                    break;
                
                case 2:
                    gerence.listarPersonagens();
                case 3:
                    gerence.adicionarItemAoPersonagem();
                default:
                    break;
            }
        } while(opcao != 4);

        sc.close();
    }
}