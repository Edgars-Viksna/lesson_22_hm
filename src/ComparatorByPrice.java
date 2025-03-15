import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Article> {
    @Override
    public int compare(Article o1, Article o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
