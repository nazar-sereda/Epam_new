public class Task2 {

    public static void main(String[] args) {

        int y = 0;


        while (y<8){
            int x = 0;
            while (x<8){
                System.out.print((x>=y) ? "*": " ");
                x++;
            }

            System.out.println(" ");
            y++;
        }

    }


}
