public class CachorroBuilder {

    private String nome = "Floquinho";
    private String raca = "Dálmata";
    private int idade = 3;
    private String genero = "Macho";
    private String cor = "Branco com preto";

    public CachorroBuilder comNome (String nome) {
        this.nome = nome;
        return this;
    }

    public CachorroBuilder comRaca (String raca) {
        this.raca = raca;
        return this;
    }

    public CachorroBuilder comIdade (int idade) {
        this.idade = idade;
        return this;
    }

    public CachorroBuilder comGenero (String genero) {
        this.genero = genero;
        return this;
    }
    public CachorroBuilder comCor (String cor) {
        this.cor = cor;
        return this;
    }

    public Cachorro construir() {
        return new Cachorro (this.nome, this.raca, this.idade, this.genero, this.cor);
    }
}



