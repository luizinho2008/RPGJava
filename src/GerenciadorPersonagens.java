import java.util.HashMap;
import java.util.Scanner;

public class GerenciadorPersonagens {
    HashMap <String, Personagem> personagens = new HashMap <String, Personagem>();

    private Scanner sc = new Scanner(System.in);

    public void criarPersonagem() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Integer tipoPersonagem;

        System.out.println("\nEscolha a classe do personagem: ");
        System.out.println("\n1. Guerreiro");
        System.out.println("2. Mago");
        System.out.println("3. Arqueiro");

        tipoPersonagem = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite o nome do personagem: ");
        String nome = sc.nextLine();

        System.out.print("Digite os pontos de vida: ");
        Integer pontosVida = sc.nextInt();

        System.out.print("Digite os pontos de mana: ");
        Integer pontosMana = sc.nextInt();

        System.out.print("Digite a força: ");
        Integer forca = sc.nextInt();

        System.out.print("Digite a inteligência: ");
        Integer inteligencia = sc.nextInt();


        switch (tipoPersonagem) {
            case 1:
                Guerreiro personagem1 = new Guerreiro(nome, pontosVida, pontosMana, forca, inteligencia);

                personagens.put(nome, personagem1);
                
                System.out.println("Personagem criado com sucesso!");
                break;

            case 2:
                Mago personagem2 = new Mago(nome, pontosVida, pontosMana, forca, inteligencia);

                personagens.put(nome, personagem2);
                System.out.println("Personagem criado com sucesso!");
                break;
            case 3:
                Arqueiro personagem3 = new Arqueiro(nome, pontosVida, pontosMana, forca, inteligencia);

                personagens.put(nome, personagem3);
                System.out.println("Personagem criado com sucesso!");
                break;
            default:
                System.out.println("Tipo de personagem inexistente");
        }
    }

    public void listarPersonagens() {
        System.out.println("\nTodos os personagens:\n");
        System.out.println(personagens);
    }
    public void adicionarItemAoPersonagem() {
        sc.nextLine();
        System.out.print("Nome do personagem: ");
        String nomePersonagem = sc.nextLine();
        Personagem personagem = personagens.get(nomePersonagem);

        if(personagem == null) {
            System.out.println("Personagem inexistente");
            return;
        }
        else {
            System.out.println("Escolha o item para adicionar: ");
            System.out.println("1. ESPADA - Uma espada afiada, boa para ataques corpo a corpo");
            System.out.println("2. ESCUDO - Um escudo resistente, aumenta a defesa");
            System.out.println("3. POCAO - Uma poção mágica, restaura pontos de vida");
            Integer itemAdd = sc.nextInt();
            Item item = Item.values()[itemAdd - 1];
            personagem.adicionarItem(item);

            System.out.println("Item " + item + " adicionado ao personagem " + nomePersonagem);
        }
        
    }
}