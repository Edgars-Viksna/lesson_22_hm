import java.util.Comparator;

public class ComparatorByRating implements Comparator<Article> {
    @Override
    public int compare(Article o1, Article o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
