public class Animal {
    private String nome;
    
    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.println(this.nome + "está comendo...");
    }

    public void fazerSom(){
        System.out.println("O animal faz um som.");
    }
    
    public String getNome(){
        return this.nome;
    }
}
