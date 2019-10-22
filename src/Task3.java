public class Task3 {
    public static void main(String[] args) {
        double result = 0;
        double deposut = 10000;
        int months = 6;
        double stavka = 12;

//        result = deposut*(1 + stavka/(12*100));

        result = Math.pow(deposut*(1 + stavka/(12*100)), 6);

        System.out.println(result);


    }
}