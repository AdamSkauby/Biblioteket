public class Main {
    public static void main(String[] args) {
        System.out.println("Biblioteket öppnar");
        Bok keltiska = new Bok("Den keltiska ringen", "Björn Larsson", 304);
        Bok hobbit = new Bok("Hobbit", "J.R.R. Tolkien", 310);
        Bok momo = new Bok("Momo", "Michael Ende", 250);
        Bok pippi = new Bok("Pippi Långstrump", "Astrid Lindgren", 160);
        Lantagare adam = new Lantagare("Adam");
        Lantagare anna = new Lantagare("Anna");
        Lantagare omar = new Lantagare("Omar");

        boolean gick = keltiska.lanaUt();
        if (gick) {
            adam.lana();
        }

        gick = keltiska.lanaUt();
        if (gick) {
            omar.lana();
        }

        adam.visa();
        anna.visa();
        omar.visa();

        for (int forsok = 1; forsok <= 3; forsok++) {
            System.out.println("Försök " + forsok);
            momo.lanaUt();
        }

        pippi.lamnaTillbaka();
        anna.lamna();
    }
}

