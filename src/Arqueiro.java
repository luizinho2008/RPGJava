public class Arqueiro extends Personagem implements Habilidade {
    public Arqueiro(String nome, int pontosVida, int pontosMana, int forca, int inteligencia) {
        super(nome, pontosVida, pontosMana, forca, inteligencia);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " dispara uma flecha!");
    }

    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " usa uma habilidade de Arqueiro!");
    }
}
