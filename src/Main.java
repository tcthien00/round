import java.util.Random;

/*
 *To round off an integer
 */
public class Main {

    public static int roundOff(int n) {
        int l;
        int r = n % 10;
        l = (n - r) / 10;
        if (r >= 5)
            l = l + 1;
        if (l < 10)
            return l * 10;
        else
            return roundOff(l) * 10;
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int max = 10000;
        int min = 0;
        for (int i=0; i<20; i++) {
            int max1 = rand.nextInt((max - min) + 1) + min;
            int r = rand.nextInt((max1 - min) + 1) + min;
            System.out.println("roundOff(" + r + ")=" + roundOff(r));
        }
    }
}
