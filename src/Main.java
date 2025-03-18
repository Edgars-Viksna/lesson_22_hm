import java.util.*;

public class Main {
    public static void main(String[] args) {
       /*
Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование, цена, рейтинг, количество штук на складе и т.д.
Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары и, в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например, по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).
Для этого, очевидно, можно использовать метод Collection.sort и реализовать несколько Comparator<Person>
        */

        List<Article> articles = new ArrayList<>();
        articles.add(new Article("Samsung", 399, 4.2, 100));
        articles.add(new Article("OPPO", 499.99, 3.9, 29));
        articles.add(new Article("Nokia", 199.99, 4.5, 300));
        articles.add(new Article("iPhone 15", 700, 3.9, 40));
        articles.add(new Article("iPhone 16", 800, 3.8, 42));


        System.out.println("How would you like to sort the articles? " + System.lineSeparator() + " By Name: enter 1" + System.lineSeparator() +
                " By price: enter 2 " + System.lineSeparator() + " By rating: enter 3 " + System.lineSeparator() + " By balance: enter 4");
        Scanner scanner = new Scanner(System.in);
        int comparatorChoice = scanner.nextInt();
        scanner.nextLine();
//        if (comparatorChoice <=0 || comparatorChoice>4){
//            System.out.println("you have entered the invalid number");

//        System.out.println("How would you like to sort the articles? " + System.lineSeparator() + "for standardised, incremental: enter 1 " + System.lineSeparator() + "for reversing, reducing: enter 11");
//
//        int comparatorChoiceReverse = scanner.nextInt();
//        scanner.nextLine();
//        if (comparatorChoice == 1 && comparatorChoiceReverse == 1) {
//            Collections.sort(articles, new ComparatorByName());
//            printArticles(articles);
//        }
//        if (comparatorChoice == 1 && comparatorChoiceReverse == 11) {
//            Collections.sort(articles, new ComparatorByName().reversed());
//            printArticles(articles);
//        }
//        if (comparatorChoice == 2 && comparatorChoiceReverse == 1) {
//            Collections.sort(articles, new ComparatorByPrice());
//            printArticles(articles);
//        }
//        if (comparatorChoice == 2 && comparatorChoiceReverse == 11) {
//            Collections.sort(articles, new ComparatorByPrice().reversed());
//            printArticles(articles);
//        }
//
//        if (comparatorChoice == 3 && comparatorChoiceReverse == 1) {
//            Collections.sort(articles, new ComparatorByRating());
//            printArticles(articles);
//        }
//        if (comparatorChoice == 3 && comparatorChoiceReverse == 11) {
//            Collections.sort(articles, new ComparatorByRating().reversed());
//            printArticles(articles);
//        }
//        if (comparatorChoice == 4 && comparatorChoiceReverse == 1) {
//            Collections.sort(articles, new ComparatorByBalance());
//            printArticles(articles);
//        }
//        if (comparatorChoice == 4 && comparatorChoiceReverse == 11) {
//            Collections.sort(articles, new ComparatorByBalance().reversed());
//            printArticles(articles);
//        }
//        if (comparatorChoice > 4 || comparatorChoice < 1) {
//            System.out.println("Please enter the correct sorting choice");
//        }
//        if (comparatorChoiceReverse != 1 || comparatorChoiceReverse != 11) {
//            System.out.println("Please enter the correct order choice");
//        }

        //  ----------switch implementation--------

        //Collections.sort(list, comparator);

        Comparator<Article> comparator = switch (comparatorChoice) {
            case 1 -> new ComparatorByName();
            case 2 -> new ComparatorByPrice();
            case 3 -> new ComparatorByRating();
            case 4 -> new ComparatorByBalance();
            default -> throw new IllegalArgumentException("Unexpected value: " + comparatorChoice);
        };

        System.out.println("How would you like to sort the articles? " + System.lineSeparator() + "for standardised, incremental: enter 1 " + System.lineSeparator() + "for reversing, reducing: enter 11");

        int comparatorChoiceReverse = scanner.nextInt();
        scanner.nextLine();
        if (comparatorChoiceReverse == 11){
            comparator=comparator.reversed();
        }
        else if (comparatorChoiceReverse != 1){
            System.out.println("Invalid order choice.");
            return;
        }

        Collections.sort(articles, comparator);
        printArticles(articles);



//        System.out.println("---  tests -------");
//
//        System.out.println("----  Sorting by name -----");
//        Collections.sort(articles, new ComparatorByName());
//        printArticles(articles);
//
//        System.out.println("-----  Sorting by name from method from Articles");
//
//        System.out.println("----  Sorting by price ----");
//        Collections.sort(articles, new ComparatorByPrice());
//        printArticles(articles);
//
//        System.out.println("----  Sorting by rating ----");
//        Collections.sort(articles, new ComparatorByRating());
//        printArticles(articles);
//
//        System.out.println("----  Sorting by stock balance ----");
//        Collections.sort(articles, new ComparatorByBalance().reversed());
//        printArticles(articles);

        scanner.close();
    }
//   -----------  Methods  -----------------

    public static void printArticles (List<Article> articles){
        for (Article article : articles){
            System.out.println(article);
        }
    }


}