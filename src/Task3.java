public class Task3 {
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

    }
}
