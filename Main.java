public class Main {
    public static void main (String[] args){
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.setNome("Rex");
        meuCachorro.raca = "Vira-Lata";
        
        Cachorro outroCachorro = new Cachorro();
        outroCachorro.setNome("Apollo");
        outroCachorro.raca = "Labrador";

        meuCachorro.latir();
        outroCachorro.latir();

        System.out.println("A raça do " + meuCachorro.getNome() + " é " + meuCachorro.raca);
    }
}
