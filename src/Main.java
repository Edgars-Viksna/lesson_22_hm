import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /*
Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование, цена, рейтинг, количество штук на складе и т.д.
Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары и, в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например, по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).
Для этого, очевидно, можно использовать метод Collection.sort и реализовать несколько Comparator<Person>
        */

        List<Article> articles = new ArrayList<>();
        articles.add(new Article("Samsung", 399, 4.2, 100));
        articles.add(new Article("OPPP", 499.99, 3.9, 29));
        articles.add(new Article("Nokia", 199.99, 4.5, 300));
        articles.add(new Article("iPhone 15", 700, 3.9, 40));
        articles.add(new Article("iPhone 16", 800, 3.8, 42));


printArticles(articles);

    }

    public static void printArticles (List<Article> articles){
        for (Article article : articles){
            System.out.println(article);

        }
    }


}