public class Guerreiro extends Personagem implements Habilidade {

    public Guerreiro(String nome, Integer pontosVida, Integer pontosMana,
    Integer forca, Integer inteligencia) {
        super(nome, pontosVida, pontosMana, forca, inteligencia);
    }

    @Override
    public void atacar() {
        System.out.println("O guerreiro está atacando");
    }

    @Override
    public void usarHabilidade() {
        System.out.println("O guerreiro está usando a sua habilidade");
    }
}