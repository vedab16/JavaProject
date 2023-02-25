public class Movie {

    String name;

    int price;
    static int ticketCounter =0;

    public Movie(String name, int price) {
        this.name = name;

        this.price = price;
        ticketCounter++;
    }
}
