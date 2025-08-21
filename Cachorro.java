public class Cachorro extends Animal {

    private String raca; //variavel nome para o cachorro
    
    //busca o nome da herança Animal. e atribui tambem a raca descrita no getRaca nessa class
    public Cachorro (String nome, String raca){
        super(nome);
        this.raca = raca;
    }

    //print latir
    public void latir() {
        System.out.println(getNome() +" está latindo: Au Au!");
    }
    
    public String getRaca(){
        return raca;
    }

    @Override
    public void fazerSom(){
        System.out.println(getNome()+ " late : Au Au!");
    }
}