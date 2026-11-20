public class Main {
    public static void main(String[] args) {
        System.out.println("=== Biblioteket öppnar ===");
        Bok keltiska = new Bok("Den keltiska ringen", "Björn Larsson", 304);
        Bok hobbit = new Bok("Hobbit", "J.R.R. Tolkien", 310);
        Bok momo = new Bok("Momo", "Michael Ende", 250);
        Bok pippi = new Bok("Pippi Långstrump", "Astrid Lindgren", 160);
        Lantagare adam = new Lantagare("Adam");
        Lantagare anna = new Lantagare("Anna");
        Lantagare omar = new Lantagare("Omar");
        System.out.println("Böcker i biblioteket: " + Bok.getAntal());



        System.out.println("=== " + adam.getNamn() + " lånar " + keltiska.getTitel() + " ===");
        boolean gick = keltiska.lanaUt();
        if (gick) {
            adam.lana();
        }
        System.out.println("Boken tar ungefär " + keltiska.lasminuter() + " minuter att läsa");

        System.out.println("=== " + omar.getNamn() + " vill också låna " + keltiska.getTitel() + " ===");
        gick = keltiska.lanaUt();
        if (gick) {
            omar.lana();
        }

        System.out.println("=== " + omar.getNamn() + " lånar " + pippi.getTitel() + " i stället ===");
        gick = pippi.lanaUt();
        if (gick) {
            omar.lana();
        }

        System.out.println("=== " + adam.getNamn() + " lämnar tillbaka " + keltiska.getTitel() + " ===");
        keltiska.lamnaTillbaka();
        adam.lamna();

        System.out.println("=== Biblioteket stänger ===");
        keltiska.visa();
        hobbit.visa();
        momo.visa();
        pippi.visa();
        adam.visa();
        anna.visa();
        omar.visa();
        System.out.println("=== Antal lantagare: " + Lantagare.getAntalLantagare() + " ===");

    }
}

