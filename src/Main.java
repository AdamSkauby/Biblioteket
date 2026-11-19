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

        keltiska.lanaUt();
        adam.lana();
        keltiska.visa();
        adam.visa();

        keltiska.lamnaTillbaka();
        adam.lamna();
        keltiska.visa();
        adam.visa();
    }
}

