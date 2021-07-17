public class ChekerPattern {
    public static void main(String... args) {
        for (int f = 1; f <= 8; f++) {
            if (f % 2 == 1) {
                for (int u = 1; u <= 8; u++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print(" ");
                for (int u = 1; u <= 8; u++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }
}

