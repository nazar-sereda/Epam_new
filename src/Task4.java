public class Task4 {
    public static void main(String[] args) {

        int y = 0;

        while (y<8){
            int x = 8;
            while (x>0){
                System.out.print((y >= x) ? "*" : " ");
                x--;
            }

            System.out.println(" ");
            y++;
        }

        int b = 0;
        while (b<8){
            int a = 0;
            while (a<8){
                System.out.print((a>=b) ? "*": " ");
                a++;
            }
            System.out.println(" ");
            b++;
        }
    }
}
