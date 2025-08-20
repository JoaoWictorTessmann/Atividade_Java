public class Cachorro {

    private String nome; //variavel nome para o cachorro
    //set e get nome
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public String getNome() {
        return this.nome;
    }

    String raca; //variavel raca para o cachorro
    //set e get raca
    public void setRaca(String novaRaca) {
        this.raca = novaRaca;
    }
    public String GetRaca() {
        return this.raca;
    }

    //print latir
    public void latir() {
        System.out.println("O cachorro " + nome + " está latindo: Au Au!");
    }
}