package nl.duo.javaklasje.hobby;

public class HobbyApp {
    public static void main(String[] args) {
        Breeder roesPlace = new Breeder("of Roes Place", false, "Nova Scotia Duck Tolling Retriever");
        roesPlace.setNumberOfDogs(3);
        roesPlace.setPuppyPrice(1150.49);
        roesPlace.litter(7);
        roesPlace.sell();

        Breeder goldenPride = new Breeder("Golden Pride's", true);
        goldenPride.setPuppyPrice(543.56);
        goldenPride.litter(7, 1200.54);
        goldenPride.getNewDog(850);

        System.out.println(goldenPride.puppyPedigree("Dexter"));

        roesPlace.puppyPedigree();

        roesPlace.getNewDog(1200);

        Company hondenWinkel = new Breeder("van het hondje", false);
        hondenWinkel.deposit(2342431.98);

        hondenWinkel.sell();
    }
}
