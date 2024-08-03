public enum Item {
    ESPADA("Uma espada afiada, boa para ataques corpo a corpo"),
    ESCUDO("Um escudo resistente, aumenta a defesa"),
    POCAO("Uma poção mágica, restaura pontos de vida");

    private String descricao;

    Item(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}