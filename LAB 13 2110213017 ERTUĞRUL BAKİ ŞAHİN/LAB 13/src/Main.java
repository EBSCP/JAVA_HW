import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(8.5, "Inception", 2010));
        movies.add(new Movie(7.9, "The Shawshank Redemption", 1994));
        movies.add(new Movie(9.3, "The Godfather", 1972));

        Collections.sort(movies);
        System.out.println("Sorted by Year: " + movies);


        Rating ratingComparator = new Rating();
        Collections.sort(movies, ratingComparator);
        System.out.println("Sorted by Rating: " + movies);


        NameCompare nameComparator = new NameCompare();
        Collections.sort(movies, nameComparator);
        System.out.println("Sorted by Name: " + movies);
    }
}