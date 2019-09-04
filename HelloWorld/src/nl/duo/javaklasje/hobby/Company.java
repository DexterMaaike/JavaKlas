package nl.duo.javaklasje.hobby;

public abstract class Company {
    private int kvkNummer;
    private double credit;
    private String naam;

    public void earn(double inkomsten){
        credit += inkomsten;
        System.out.println("Banksaldo is nu " + credit);
    }

    public void spend(double cost){
        credit -= cost;
        System.out.println("Banksaldo is nu " + credit);
    }

    public void deposit (double money){
        credit += money;
        System.out.println("Banksaldo is nu " + credit);
    }

    public abstract void sell();

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getKvkNummer() {
        return kvkNummer;
    }

    public void setKvkNummer(int kvkNummer) {
        this.kvkNummer = kvkNummer;
    }

}
