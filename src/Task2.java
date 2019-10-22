import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws Exception {

        System.out.println("Please enter your value in pounds -> ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = reader.readLine();
        double inputDouble = Double.parseDouble(inputValue);

        final double POUND = 453.6;
        double convector = 0;
        int firstPartOfNumber = 0;
        double secondPartOfNumber = 0;



        convector = POUND*inputDouble;

//        System.out.println(convector);

        convector = convector/1000;
//        System.out.println(convector);

        firstPartOfNumber = (int)convector;
//        System.out.println(firstPartOfNumber);

        secondPartOfNumber = 1000*(convector - firstPartOfNumber);
//        System.out.println(secondPartOfNumber);

        if (firstPartOfNumber >= 2){
            System.out.println(firstPartOfNumber + " Kilograms " + secondPartOfNumber + " grams" );
        }

        else{
            System.out.println(firstPartOfNumber + " Kilogram " + secondPartOfNumber + " grams" );
        }

    }
}