public class Main {
    public static void main (String[] args){
        Cachorro meuCachorro = new Cachorro("Apollo", "Vira-lata Caramelo");

        System.out.println("Nome:" + meuCachorro.getNome());
        System.out.println("Raca:" + meuCachorro.getRaca());
        meuCachorro.latir();
        meuCachorro.comer();
    }
}
