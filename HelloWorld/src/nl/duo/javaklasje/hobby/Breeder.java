package nl.duo.javaklasje.hobby;

public class Breeder extends Company {
    private String pedigreeName;
    private boolean pedigreeNameIsPrefix;
    private int numberOfDogs;
    private String breed;
    private double puppyPrice;

    public Breeder(String pedigreeName, boolean pedigreeNameIsPrefix, String breed) {
        this.pedigreeName = pedigreeName;
        this.breed = breed;
    }


    public Breeder(String pedigreeName, boolean isPrefix) {
        this.pedigreeName = pedigreeName;
        this.pedigreeNameIsPrefix = isPrefix;
    }
    @Override
    public void sell() {
        if (numberOfDogs > 0) {
            numberOfDogs--;
            earn(puppyPrice);
            System.out.println(pedigreeName + "heeft nu " + numberOfDogs + " honden.");
            System.out.println(pedigreeName + "heeft nu " + getCredit() + "op de bank");
        } else {
            System.out.println("Er zijn geen honden om te verkopen");
        }
    }

    public void litter(int litterSize) {
        numberOfDogs += litterSize;
        System.out.println(pedigreeName + "heeft nu " + numberOfDogs + " honden.");
    }

    public void litter(int litterSize, double studPrize) {
        numberOfDogs += litterSize;
        System.out.println(pedigreeName + "heeft nu " + numberOfDogs + " honden.");
        spend(studPrize);
    }

    public void getNewDog(int price) {
        numberOfDogs++;
        System.out.println(pedigreeName + "now has " + numberOfDogs + " dogs");
        spend(price);
    }

    public String puppyPedigree(String puppyName) {
        StringBuilder builder = new StringBuilder();
        if (pedigreeNameIsPrefix) {
            builder.append(pedigreeName);
            builder.append(" ");
            builder.append(puppyName);
        } else {
            builder.append(puppyName);
            builder.append(" ");
            builder.append(pedigreeName);
        }
        return builder.toString();
    }

    public void puppyPedigree() {
        System.out.println("Puppy heeft nog geen naam");
    }

    @Override
    public void deposit(double money) {
        System.out.println("Dit slaat nergens op, maar ik moest even wat overriden");
    }

    public void setNumberOfDogs(int numberOfDogs) {
        this.numberOfDogs = numberOfDogs;
    }

    public void setPuppyPrice(double puppyPrice) {
        this.puppyPrice = puppyPrice;
    }

    public String getPedigreeName() {
        return pedigreeName;
    }
}
