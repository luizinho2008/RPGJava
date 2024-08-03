import java.util.ArrayList;

public abstract class Personagem {
    private String nome;
    private Integer pontosVida;
    private Integer pontosMana;
    private Integer forca;
    private Integer inteligencia;
    private ArrayList<Item> inventario = new ArrayList<Item>();
    
    public Personagem(String nome, Integer pontosVida, Integer pontosMana, Integer forca, Integer inteligencia) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.pontosMana = pontosMana;
        this.forca = forca;
        this.inteligencia = inteligencia;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontosVida() {
        return this.pontosVida;
    }
    public void setPontosVida(Integer pontosVida) {
        this.pontosVida = pontosVida;
    }

    public Integer getPontosMana() {
        return this.pontosMana;
    }
    public void setPontosMana(Integer pontosMana) {
        this.pontosMana = pontosMana;
    }

    public Integer getForca() {
        return this.forca;
    }
    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getInteligencia() {
        return this.inteligencia;
    }
    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void adicionarItem(Item item) {
        inventario.add(item);
    };

    @Override
    public String toString() {
        return "\nNome = " + nome + "\nPontos vida = " + pontosVida + "\nPontos mana = " + pontosMana + "\nForca="
                + forca + "\nInteligencia = " + inteligencia + "\nInventario = " + inventario + "\n\n";
    }
    public abstract void atacar();
}