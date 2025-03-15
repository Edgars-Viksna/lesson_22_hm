import java.util.Comparator;

public class ComparatorByName implements Comparator<Article> {
    @Override
    public int compare(Article o1, Article o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}
