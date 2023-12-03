import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(nums);
        task4(List.of("один", "два", "два", "три", "три", "три"));

    }


    private static void task1(List<Integer> numbers) {
        System.out.println("Задание 1");
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                System.out.print(number);
            }
        }
        System.out.println(" ");
    }

    private static void task2(List<Integer> numbers) {
        System.out.println("Задание 2");
        Set<Integer> nums1 = new TreeSet<>(numbers);
        for (Integer number : nums1) {
            if (number % 2 == 0) {
                System.out.print(number);
            }
        }
        System.out.println(" ");
    }

    private static void task3(List<Integer> nums) {
        System.out.println("Задание 3");
        Set<Integer> numbers = new HashSet<>(List.of(1, 2, 3, 1, 2, 3));
        System.out.println(numbers);
    }

    private static void task4(List<String> words) {
        System.out.println("Задание 4");
        Set<Integer> set = new TreeSet<>();
        for (String word : words) {
            int frequency = Collections.frequency(words, word);
            set.add(frequency);
        }
        System.out.println(set);
        }
    }






