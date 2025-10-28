package lesson14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // GenericValue örnekleri
        GenericValue<Integer> intValue = new GenericValue<>(42);
        GenericValue<String> stringValue = new GenericValue<>("Test Otomasyon");
        GenericValue<Double> doubleValue = new GenericValue<>(12.5);

        intValue.printValue();
        stringValue.printValue();
        doubleValue.printValue();

        // Getter ve Setter
        System.out.println("\nMevcut integer değer: " + intValue.getValue());
        intValue.setValue(99);
        System.out.println("Yeni integer değer: " + intValue.getValue());

        // Stream API örneği
        List<Integer> sayilar = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Çift sayıları yazdır
        System.out.println("\nÇift Sayılar:");
        sayilar.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        // StreamHelper ile koşula uyan ilk öğeyi yazdır
        System.out.print("\n5’ten büyük ilk sayı: ");
        StreamHelper.printFirstMatch(sayilar, num -> num > 5);

        System.out.print("15’ten büyük sayı sonucu: ");
        StreamHelper.printFirstMatch(sayilar, num -> num > 15);
    }
}
