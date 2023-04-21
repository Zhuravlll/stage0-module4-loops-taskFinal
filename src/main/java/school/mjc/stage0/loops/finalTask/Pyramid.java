package school.mjc.stage0.loops.finalTask;

public class Pyramid {


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

    public void printPyramid(int cathetusLength) {
        int count = 1;
        int spaces = cathetusLength - 1;
        for (int i = 0; i < cathetusLength; i++) {
            printRow(count, spaces);
            System.out.println();
            if (count < cathetusLength) {
                count++;
                spaces--;
            }
        }
    }

    private void printRow(int a, int spaces) {
        for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
        }
        switch (a) {
            case 1 -> System.out.print("1");
            case 2 -> System.out.print("212");
            case 3 -> System.out.print("32123");
            case 4 -> System.out.print("4321234");
            case 5 -> System.out.print("543212345");
            case 6 -> System.out.print("65432123456");
            case 7 -> System.out.print("7654321234567");
            case 8 -> System.out.print("876543212345678");
            case 9 -> System.out.print("98765432123456789");
        }
    }
}