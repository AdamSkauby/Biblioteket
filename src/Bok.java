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

    public boolean lanaUt() {
        if (utlanad) {
            System.out.println(titel + " är redan utlånad");
            return false;
        } else {
            utlanad = true;
            System.out.println(titel + " lånas ut");
            return true;
        }
    }

    public void lamnaTillbaka() {
        if (utlanad) {
            utlanad = false;
            System.out.println(titel + " lämnas tillbaka");
        } else {
            System.out.println(titel + " är inte utlånad");
        }
    }

    public int lasminuter() {
        return sidor * 2;
    }
}
