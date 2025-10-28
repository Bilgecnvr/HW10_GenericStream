package lesson14;

import java.util.List;
import java.util.function.Predicate;

public class StreamHelper {

    // Koşula uyan ilk öğeyi bul ve sonucu yazdır
    public static <T> void printFirstMatch(List<T> list, Predicate<T> condition) {
        T result = list.stream()
                .filter(condition)
                .findFirst()
                .orElse(null);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println(-1); // Ödev gereği
        }
    }
}
