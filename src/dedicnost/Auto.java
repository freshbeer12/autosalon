package dedicnost;

public class Auto {

    private int pocetSedadel = 5;
    private int pocetDveri = 5;
    private int pocetNahradnichKol = 1;
    private int pocetKoni;
    private int cena;
    private String barva;
    private int spz1;
    private int spz2;

    public Auto(int pocetKoni, int cena, String barva) {
        this.pocetKoni = pocetKoni;
        this.cena = cena;
        this.barva = barva;
    }

    public void vypisInfo(){
        System.out.println("Počet sedadel: " + pocetSedadel);
        System.out.println("Počet dveři: " + pocetDveri);
        System.out.println("Počet náhradních kol: " + pocetNahradnichKol);
        System.out.println("Počet koní: " + pocetKoni);
        System.out.println("Cena: " + cena);
        System.out.println("Barva: " + barva);
        System.out.println("Spz: " + spz1 + " " + spz2);
    }

    public void jizdaStart(){
        System.out.println("Auto začalo svou jízdu");
    }

    public int getPocetSedadel() {
        return pocetSedadel;
    }

    public int getPocetNahradnichKol() {
        return pocetNahradnichKol;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    public int getPocetKoni() {
        return pocetKoni;
    }

    public int getCena() {
        return cena;
    }

    public String getBarva() {
        return barva;
    }

    public void vytvorSPZ(){
        spz1 = (int)(Math.random()*1000);
        spz2 = (int)(Math.random()*10000);
    }
}
