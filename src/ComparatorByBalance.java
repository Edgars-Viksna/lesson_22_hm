import java.util.Comparator;

public class ComparatorByBalance implements Comparator<Article> {
    @Override
    public int compare(Article o1, Article o2) {
        return Integer.compare(o1.getBalance(), o2.getBalance());
    }
}
