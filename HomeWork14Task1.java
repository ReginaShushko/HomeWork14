package homeWork14;

import java.util.*;

public class HomeWork14Task1 {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();

        Random random = new Random();
        for (int index = 0; index < 5; index++) {
            col.add(random.nextInt(19) + 1);
        }
        System.out.println("Array elements: " + col);

        System.out.println("Max number: " + getMax(col));
        System.out.println("Min number: " + getMin(col));
        System.out.println("Average: " + getAverage(col));
        System.out.println("Sum: " + getSum(col));
        System.out.println("Multiplication: " + getMultiply(col));
        System.out.println("Sum digits: " + getSumDigits(col));
    }

    public static Integer getMax(Collection<Integer> col) {
        return col.stream()
                .max(Integer::compare)
                .get();
    }

    public static Integer getMin(Collection<Integer> col) {
        return col.stream()
                .min(Integer::compare)
                .get();
    }

    public static OptionalDouble getAverage(Collection<Integer> col) {
        return col.stream()
                .mapToInt(Integer::intValue)
                .average();
    }

    public static Integer getSum(Collection<Integer> col) {
        return col.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static Integer getMultiply(Collection<Integer> col) {
        return col.stream()
                .mapToInt(Integer::intValue)
                .reduce(1, (a, b) -> a * b);
    }

    public static Integer getSumDigits(Collection<Integer> col) {
        return col.stream()
                .map(x -> {
                    int sumOfDigits = 0;
                    while (x != 0) {
                        sumOfDigits += x % 10;
                        x /= 10;
                    }
                    return sumOfDigits;
                })
                .mapToInt(x -> x)
                .sum();
    }
}