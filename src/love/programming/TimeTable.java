package love.programming;

public class TimeTable {
    static int x;
    static int y;
    static int z;

    public static void main(String[] args) {


        for (x = 1; x <21; x++) {

            for (y = 1; y <21; y++) {

                z = x * y;

                System.out.println(x + " X " + y + " = " + z);
            }
        }

    }
}

