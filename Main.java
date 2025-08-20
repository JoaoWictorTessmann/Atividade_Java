public class Main {
    public static void main (String[] args){
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Rex";
        meuCachorro.raca = "Vira-Lata";
        
        Cachorro outroCachorro = new Cachorro();
        outroCachorro.nome = "Apollo";
        outroCachorro.raca = "Labrador";

        meuCachorro.latir();
        outroCachorro.latir();

        System.out.println("A raça do " + meuCachorro.nome + " é " + meuCachorro.raca);
    }
}
