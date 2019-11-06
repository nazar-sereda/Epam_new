import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) throws IOException {
        int size = getSize();
        int[] array1 = createArray(size);
        System.out.println(Arrays.toString(array1));
        int[] array3 = positiveArr(array1);
        System.out.println(Arrays.toString(array3));
        int[] array2 = negativeArr(array1);
        System.out.println(Arrays.toString(array2));

    }

    private static int[] positiveArr(int[] array) {
        int[] array3 = new int[0];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array3 = Arrays.copyOf(array3, array3.length + 1);
                array3[j] = array[i];
                j++;
            }
        }
        return array3;
    }


    private static int[] negativeArr(int[] array) {
        int[] array2 = new int[0];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array2 = Arrays.copyOf(array2, array2.length + 1);
                array2[j] = array[i];
                j++;
            }
        }
        return array2;
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
        BufferedReader readre = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            System.out.print("Please enter number -> ");
            int size = Integer.parseInt(readre.readLine());
            if (size > 0) {
                return size;
            }
            System.out.print("Invalid number, choose correct number.");
        }


    }
}
