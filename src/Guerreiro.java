public class Guerreiro extends Personagem implements Habilidade {
    public Guerreiro(String nome, int pontosVida, int pontosMana, int forca, int inteligencia) {
        super(nome, pontosVida, pontosMana, forca, inteligencia);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " realiza um ataque físico!");
    }

    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " usa uma habilidade de Guerreiro!");
    }
}
