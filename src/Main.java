public class Main {
    public static void main(String[] args) {
            System.out.println("Biblioteket öppnar");
            Bok keltiska = new Bok("Den keltiska ringen", "Björn Larsson", 304);
            Bok hobbit = new Bok("Hobbit", "J.R.R. Tolkien", 310);
            Bok momo = new Bok("Momo", "Michael Ende", 250);
            Bok pippi = new Bok("Pippi Långstrump", "Astrid Lindgren", 160);
            System.out.println(keltiska.titel + " av " + keltiska.forfattare);
            System.out.println(hobbit.titel + " av " + hobbit.forfattare);
            System.out.println(momo.titel + " av " + momo.forfattare);
            System.out.println(pippi.titel + " av " + pippi.forfattare);

            Lantagare adam = new Lantagare("Adam");
            Lantagare anna = new Lantagare("Anna");
            Lantagare omar = new Lantagare("Omar");
            System.out.println(adam.namn + " har " + adam.antalLan + " lån");
            System.out.println(anna.namn + " har " + anna.antalLan + " lån");
            System.out.println(omar.namn + " har " + omar.antalLan + " lån");
    }
}

