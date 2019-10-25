public class Task5 {
    public static void main(String[] args) {
        int line = 1;
        while (line <= 11) {
            int row = 8;
            if (line <= 6) {
                while (row > 1) {

                    System.out.print((row > line) ? " " : " *");
                    row--;
                }
            } else {
                while (row > 1) {

                    System.out.print((row+5)> line ? " ": " *");
                    row--;
                }
            }
            System.out.println();
            line++;
        }
    }
}
