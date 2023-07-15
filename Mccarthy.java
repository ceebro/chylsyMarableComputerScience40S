package mccarthy;

public class Mccarthy {

    public static void main(String[] args) {

        int n = -20;
        for (int i = 0; i < 16; i++) {

            n = n + 20;
            System.out.println("Number = " + n);

            int mcCarthy = mcCarthy91(n);
            System.out.println("McCarthy value = " + mcCarthy + "\n");
        }
    }

    public static int mcCarthy91(int n) {

        if (n <= 0) {

            return 0;
        } else if (n > 100) {

            return n - 10;
        } else {

            return mcCarthy91(mcCarthy91(n + 11));
        }
    }
}
