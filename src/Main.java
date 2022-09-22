import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        isLeapYear(rnd.nextInt(2023));
        giveMeApp(2008 + rnd.nextInt(15), rnd.nextInt() > rnd.nextInt());
        shippingTime(rnd.nextInt(100));
        Character[] FullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        Integer[] intArray = {3, 2, 1, 6, 5};
        task_4(FullName);
        task_4(intArray);
        findDuplicates("aabccddefgghiijjkk");
        findDuplicates("acdgijk");
        task_6(30+rnd.nextInt(10));
    }

    static void isLeapYear(int year) {
        System.out.println("Задание 1");
        boolean b1 = year % 4 == 0;
        boolean b2 = year % 100 != 0;
        boolean b3 = year % 400 == 0;
        if ((b1 && b2) || b3) System.out.printf("%d - високосный год!", year);
        else System.out.printf("%d - не високосный год!\n", year);
        System.out.println("***\n");
    }

    static void giveMeApp(int year, boolean isAndroid) {
        System.out.println("Задание 2");
//        System.out.println("Parameters - " + year + "; " + isAndroid + ".");
        String opSus = isAndroid ? "Android" : "iOS";
        String version = year >= 2015 ? "стандартную" : "облегченную";
        System.out.printf("Установите %s версию приложения для %s по ссылке\n", version, opSus);
        System.out.println("***\n");
    }

    static void shippingTime(int distance) {
        System.out.println("Задание 3");
//        System.out.println("Parameters - " + distance + ".");
        int time = 1;
        if (distance > 20) time++;
        if (distance > 60) time++;
        System.out.println("Потребуется дней: " + time + ".");
        System.out.println("***\n");
    }

    static <T> void reverse(T[] array) {
        T tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    static <T> void task_4(T[] array) {
        System.out.println("Задание 4");
        System.out.println("Массив до разворота - " + Arrays.toString(array));
        reverse(array);
        System.out.println("Массив после разворота - " + Arrays.toString(array));
        System.out.println("***\n");
    }

    static void findDuplicates(String str) {
        System.out.println("Задание 5");
        char[] charArray = str.toCharArray();
//        Arrays.sort(charArray); // if string not sorted
        for (int i = 0; i < charArray.length - 1; i += 2) {
            if (charArray[i] == charArray[i + 1]) {
                System.out.println("В строке задублирован символ - " + charArray[i] + ".");
                System.out.println("***\n");
                return;
            }
        }
        System.out.println("Повторов не найдено!\n***\n");
    }

    static int[] generateArray(int i) {
        Random rnd = new Random();
        int[] result = new int[i];
        for (int j = 0; j < i; j++) {
            result[j] = 100_000 + rnd.nextInt(100_000);
        }
        return result;
    }

    static int getSum(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }

    static double getMediumValue(int[] array) {
        double sum = getSum(array);
        return sum / array.length;
    }

    static void task_6(int i) {
        System.out.println("Задание 6");
        int[] array = generateArray(i);
        System.out.printf("Среднее значение массива из %d элементов равно %.2f.\n",i,getMediumValue(array));
        System.out.println("***\n");
    }
}