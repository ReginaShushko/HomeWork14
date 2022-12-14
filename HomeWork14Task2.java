package homeWork14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HomeWork14Task2 {
    public static void main(String[] args) {
        List<String> initialStrings = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        List<String> filteredAndSortedStrings = initialStrings.stream()
                .filter(string -> !string.contains("3"))
                .sorted(Comparator.comparing(o -> o.substring(1)))
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .toList();
        int listCount = filteredAndSortedStrings.size();
        List<String> cutListStrings = filteredAndSortedStrings.stream()
                .limit(listCount - 1)
                .skip(1)
                .toList();
        System.out.println(cutListStrings);
    }
}
