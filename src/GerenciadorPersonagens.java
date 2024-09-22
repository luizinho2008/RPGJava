import java.util.HashMap;
import java.util.Scanner;

public class GerenciadorPersonagens {
    private final HashMap<String, Personagem> personagens = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public void criarPersonagem() throws Exception {
        clearScreen();
        System.out.println("======== Legends of Thalion ========\n\n");
        System.out.println("Escolha a classe do personagem:");
        System.out.println("1. Guerreiro\n2. Mago\n3. Arqueiro");
        int classe = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        clearScreen();
        System.out.println("======== Legends of Thalion ========\n\n");
        System.out.println("Digite o nome do personagem:");
        String nome = scanner.nextLine();

        System.out.println("Digite os pontos de vida:");
        int pontosVida = scanner.nextInt();

        System.out.println("Digite os pontos de mana:");
        int pontosMana = scanner.nextInt();

        System.out.println("Digite a força:");
        int forca = scanner.nextInt();

        System.out.println("Digite a inteligência:");
        int inteligencia = scanner.nextInt();

        switch (classe) {
            case 1 -> personagens.put(nome, new Guerreiro(nome, pontosVida, pontosMana, forca, inteligencia));
            case 2 -> personagens.put(nome, new Mago(nome, pontosVida, pontosMana, forca, inteligencia));
            case 3 -> personagens.put(nome, new Arqueiro(nome, pontosVida, pontosMana, forca, inteligencia));
            default -> throw new Exception("Classe inválida!");
        }
        clearScreen();
        System.out.println("Personagem criado com sucesso!");
    }

    public void listarPersonagens() {
        if (personagens.isEmpty()) {
            System.out.println("Nenhum personagem criado.");
            return;
        }

        for (Personagem personagem : personagens.values()) {
            System.out.println("Nome: " + personagem.getNome() +
                    ", Classe: " + personagem.getClass().getSimpleName() +
                    ", Vida: " + personagem.getPontosVida() +
                    ", Mana: " + personagem.getPontosMana() +
                    ", Força: " + personagem.getForca() +
                    ", Inteligência: " + personagem.getInteligencia());
            personagem.listarItens();
            System.out.println();
        }
    }

    public void adicionarItemAoPersonagem() {
        clearScreen();
        System.out.println("======== Legends of Thalion ========\n\n");
        scanner.nextLine();
        System.out.println("Digite o nome do personagem:");
        String nome = scanner.nextLine();

        Personagem personagem = personagens.get(nome);
        if (personagem == null) {
            System.out.println("Personagem não encontrado.");
            return;
        }

        System.out.println("\nEscolha o item para adicionar:");
        for (Item item : Item.values()) {
            System.out.println(item.ordinal() + 1 + ". " + item.name() + " - " + item.getDescricao());
        }
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > Item.values().length) {
            System.out.println("Item inválido.");
            return;
        }
        Item item = Item.values()[escolha - 1];
        personagem.adicionarItem(item);
    }

    public void procurarPersonagem() {
        clearScreen();
        System.out.println("Buscar personagem:");
        String nome = scanner.nextLine();

        Personagem personagem = personagens.get(nome);
        if (personagem == null) {
            System.out.println("Personagem não cadastrado");
        } else {
            System.out.println("Nome: " + personagem.getNome() +
                    ", Classe: " + personagem.getClass().getSimpleName() +
                    ", Vida: " + personagem.getPontosVida() +
                    ", Mana: " + personagem.getPontosMana() +
                    ", Força: " + personagem.getForca() +
                    ", Inteligência: " + personagem.getInteligencia());
            personagem.listarItens();
            System.out.println();
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
