abstract class Animal {
    private String nome;
    
    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.println(this.nome + "está comendo...");
    }

    public abstract void fazerSom();
    
    public String getNome(){
        return this.nome;
    }
}
