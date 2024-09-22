public class Mago extends Personagem implements Habilidade {
    public Mago(String nome, int pontosVida, int pontosMana, int forca, int inteligencia) {
        super(nome, pontosVida, pontosMana, forca, inteligencia);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança um feitiço!");
    }

    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " usa uma habilidade de Mago!");
    }
}
