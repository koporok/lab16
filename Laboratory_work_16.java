import java.util.Arrays;

public class Laboratory_work_16 {
    public static void sortArray(int[] array, Condition condition) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (condition.check_cond(array[j], min)) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 3};

        // Сортировка по возрастанию
        sortArray(array, (a, b) -> a < b);
        System.out.println("Сортировка по возрастанию: " + Arrays.toString(array));

        // Сортировка по убыванию
        sortArray(array, (a, b) -> b < a);
        System.out.println("Сортировка по убыванию: " + Arrays.toString(array));
    }
}
