import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {


    /*1. Пользователь вводит в консоль 10 чисел.
2. Соберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)
3. Бинарным поиском найдите число в этом массиве, которое пользователь введет 11ым. Выведите его индекс на экран*/

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Введите 10 чисел:");
        for (int i = 0; i < 10; i++) {

            array[i] = scanner.nextInt();
        }
        bubbleSort(array);

        int number = scanner.nextInt();
        int result = binarySearch(array, number, 0, array.length - 1);

        if (result == -1) {
            System.out.println("число не найдено");
        } else {
            System.out.println(result);

        }
    }
        public static void bubbleSort ( int[] array){

            for (int j = 0; j < array.length - 1; j++) {
                boolean isChanged = false;
                for (int i = 0; i < array.length - j - 1; i++) {

                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        isChanged = true;
                    }
                }
                if (!isChanged) {
                    break;
                }
                System.out.println(Arrays.toString(array));
            }
        }

        public static int binarySearch ( int[] array, int number, int start, int finish){
            int index = -1;
            int median = (start + finish) / 2;

            if (array[median] == number) {
                index = median;
            }
            if (start == finish && array[median] != number) {
                return -1;
            }
            if (array[median] > number) {
                index = binarySearch(array, number, start, median - 1);
            }
            if (array[median] < number) {
                index = binarySearch(array, number, median + 1, finish);
            }
            return index;
        }
    }
















