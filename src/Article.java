public class Article {

    private String title;
    private double price;
    private double rating;
    private int balance;

    public Article(String title, double price, double rating, int balance) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.balance = balance;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Article " +
                "title: '" + title + '\'' +
                ", price " + price +
                ", rating " + rating +
                ", stock balance " + balance ;
    }


}
