

public class SquareHallowPattern {
    public static void main(String[] args) {
        int line = 5;
        for (int rows = 1; rows <= line; rows++) {
            for (int columns = 1; columns <= line; columns++) {
                if (rows==1||columns==1||rows==line||columns==line) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
