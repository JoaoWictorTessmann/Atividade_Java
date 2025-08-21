public class Main {
    public static void escutarSom(Animal animal){
        System.out.println("Ouvindo o som do animal... ");
        animal.fazerSom();
    }
    public static void main (String[] args){
        Animal rex = new Cachorro("Rex", "Pintcher");
        Animal Apollo = new Cachorro("Apollo", "Pit-Bull");
        
        escutarSom(rex);
        escutarSom(Apollo);
    }
}
