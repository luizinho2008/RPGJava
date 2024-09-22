import java.util.Scanner;

public class Partida {

    public void iniciarPartida() {
        clearScreen();

        GerenciadorPersonagens gerenciadorPersonagens = new GerenciadorPersonagens();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                displayMenu();
                int opcao = scanner.nextInt();
                scanner.nextLine();  // Consumir a nova linha

                try {
                    switch (opcao) {
                        case 1:
                            clearScreen();
                            gerenciadorPersonagens.criarPersonagem();
                            break;
                        case 2:
                            clearScreen();
                            gerenciadorPersonagens.listarPersonagens();
                            break;
                        case 3:
                            clearScreen();
                            gerenciadorPersonagens.adicionarItemAoPersonagem();
                            break;
                        case 4:
                            clearScreen();
                            gerenciadorPersonagens.procurarPersonagem();
                            break;
                        case 5:
                            System.out.println("Saindo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro: " + e.getMessage());
                }
            }
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void displayMenu() {
        System.out.println("======== Legends of Thalion ========\n\n");
        System.out.println("Escolha uma opção:\n");
        System.out.println("1. Criar Personagem");
        System.out.println("2. Listar Personagens");
        System.out.println("3. Adicionar Item ao Personagem");
        System.out.println("4. Buscar por personagem");
        System.out.println("5. Sair");
    }

}
