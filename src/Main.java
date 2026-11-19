public class Main {
    public static void main(String[] args) {
            System.out.println("Biblioteket öppnar");
            Bok hobbit = new Bok("Hobbit", "J.R.R. Tolkien", 310);
            Bok momo = new Bok("Momo", "Michael Ende", 250);
            Bok pippi = new Bok("Pippi Långstrump", "Astrid Lindgren", 160);
            System.out.println(hobbit.titel + " av " + hobbit.forfattare);
            System.out.println(momo.titel + " av " + momo.forfattare);
            System.out.println(pippi.titel + " av " + pippi.forfattare);
    }
}

