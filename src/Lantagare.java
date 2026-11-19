public class Lantagare {
    String namn;
    int antalLan;

    public Lantagare(String namn) {
        this.namn = namn;
        this.antalLan = 0;
    }

    public void visa() {
        System.out.println(namn + " har " + antalLan + " lån");
    }

    public void lana() {
        antalLan = antalLan + 1;

    }

    public void lamna() {
        antalLan = antalLan - 1;
    }
}
