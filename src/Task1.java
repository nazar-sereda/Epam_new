public class Task1 {
    public static void main(String[] args) {
        int number = 123;
        int reversed = 0;


        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 +digit;
            number = number/10;
        }

        System.out.println(reversed);

        int sum = 0;
        int reversed2 = reversed;

        while (reversed2 > 0){
            sum = sum + reversed2 % 10;
            reversed2 = reversed2 /10;
        }

        System.out.println(sum);

        System.out.println("Final value -> " + (reversed - sum));
    }
}