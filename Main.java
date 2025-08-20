public class Main {
    public static void main (String[] args){
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Rex";
        meuCachorro.raca = "Vira-Lata";
        
        Cachorro outroCachorro = new Cachorro();
        meuCachorro.nome = "Apollo";
        meuCachorro.raca = "Labrador";

        meuCachorro.latir();
        outroCachorro.latir();

        System.out.println("A raça do " + meuCachorro.nome + " é " + meuCachorro.raca);
    }
}
