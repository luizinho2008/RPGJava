public class Mago extends Personagem implements Habilidade {

    public Mago(String nome, Integer pontosVida, Integer pontosMana,
    Integer forca, Integer inteligencia) {
        super(nome, pontosVida, pontosMana, forca, inteligencia);
    }

    @Override
    public void atacar() {
        System.out.println("O mago está atacando");
    }

    @Override
    public void usarHabilidade() {
        System.out.println("O mago está usando a sua habilidade");
    }
}