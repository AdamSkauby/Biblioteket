public class Bok {
    String titel;
    String forfattare;
    int sidor;
    boolean utlanad;

    public Bok(String titel, String forfattare, int sidor) {
        this.titel = titel;
        this.forfattare = forfattare;
        this.sidor = sidor;
        this.utlanad = false;
    }

    public void visa() {
        System.out.println(titel + " av " + forfattare + ", " + sidor + " sidor. Utlånad: " + utlanad);
    }

    public void lanaUt() {
        utlanad = true;
        System.out.println(titel + " lånas ut");
    }

    public void lamnaTillbaka() {
        utlanad = false;
        System.out.println(titel + " lämnas tillbaka");
    }
}
