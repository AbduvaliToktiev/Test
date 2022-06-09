import java.util.Arrays;

// Найти второй минимальный элемент массива
public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{56, 65, 67, 68, 86, 98, 78, 84, 87};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min1) {
                min2 = min1;
                min1 = array[i];
            } else if (array[i] < min2 && array[i] != min1) {
                min2 = array[i];
            }
        }
        System.out.println("Минимальный элемент в массиве: " + min1);
        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Второй по минимальности элемент в массиве: " + min2);
        } else {
            System.out.println("Второго по минимальности элемента в массиве нет");
        }
    }
}

//Напишите метод uniqueCount, который будет находить количество уникальных чисел в массиве. Если число повторяется больше одного раза, то его стоит учитывать, но только один раз. Длина массива > 0.
//Пример:
//Входящие данные {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11}
//Ответ 7
//Объяснение
//Массив без повторений будет выглядеть 4, 5, 10, 11, 12, 44, 100 - длина 7.
class Massiv {
    public static void main(String[] args) {
        int[] array = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11, 3};
        System.out.println(Arrays.toString(array));
        System.out.println("Кодичество чисел если убрать дубликаты: " + uniqueCount(array));
    }

    static int uniqueCount(int[] array) {
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
        }
        System.out.println("Общее количество чисел в массиве: " + countUnique);
        System.out.println("Количество дубликатов в массиве: " + count);
        return countUnique - count;
    }
}

class Example {
    public static void main(String[] arg) {

        int array1[] = new int[8];

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        int[] array2 = {2, 5, 7, 8};
        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));
        int m = 4, n = 4;
        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (array1[i] > array2[j]) {
                array1[index--] = array1[i--];
            } else {
                array1[index--] = array2[j--];
            }
        }
        while (i >= 0) {
            array1[index--] = array1[i--];
        }
        while (j >= 0) {
            array1[index--] = array2[j--];
        }

        System.out.println("Общий массив: " + Arrays.toString(array1));
    }
}
