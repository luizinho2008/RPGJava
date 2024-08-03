public class Arqueiro extends Personagem implements Habilidade {

    public Arqueiro(String nome, Integer pontosVida, Integer pontosMana,
    Integer forca, Integer inteligencia) {
        super(nome, pontosVida, pontosMana, forca, inteligencia);
    }

    @Override
    public void atacar() {
        System.out.println("O arqueiro está atacando");
    }

    @Override
    public void usarHabilidade() {
        System.out.println("O arqueiro está usando a sua habilidade");
    }
}