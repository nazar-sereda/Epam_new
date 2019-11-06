import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Task2  {
    public static void main(String[] args) throws  IOException{
        int size = getSize();
        int[] array1 = createArray(size);
        System.out.println(Arrays.toString(array1));
        int[] array2 = createArray(size);
        System.out.println(Arrays.toString(array2));
        int[] array3 = sumArrays(array1, array2);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30) - 10;
        }
        return array;
    }

    public static int getSize() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        int size = 0;
        while (true) {
            System.out.print("Please enter number -> ");

            size = Integer.parseInt(reader.readLine());
            if (size > 0) {
                return size;
            }
            System.out.print("Invalid number, choose correct number.");
        }
    }

    public static int[] sumArrays (int[] array1, int[] array2) {
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        return array3;
    }
}
