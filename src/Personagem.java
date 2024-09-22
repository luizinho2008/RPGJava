import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {
    private String nome;
    private int pontosVida;
    private int pontosMana;
    private int forca;
    private int inteligencia;
    private List<Item> inventario = new ArrayList<>();

    public Personagem(String nome, int pontosVida, int pontosMana, int forca, int inteligencia) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.pontosMana = pontosMana;
        this.forca = forca;
        this.inteligencia = inteligencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(int pontosMana) {
        this.pontosMana = pontosMana;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void adicionarItem(Item item) {
        inventario.add(item);
        clearScreen();
        System.out.println(item.name() + " adicionado ao inventário de " + nome);
    }

    public void listarItens() {
        System.out.println("Inventário de " + nome + ":");
        for (Item item : inventario) {
            System.out.println("[" + item.name() + " - " + item.getDescricao() + "]");
        }
    }

    public abstract void atacar();

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
