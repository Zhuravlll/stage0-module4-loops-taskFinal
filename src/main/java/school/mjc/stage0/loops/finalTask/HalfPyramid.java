package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int count = 1;
        int spaces = cathetusLength - 1;
        for (int i = 0; i < cathetusLength; i++) {
                printRow(count, spaces);
                System.out.println();
                    count++;
                    spaces--;
            }
        }

    private void printRow(int a, int spaces) {
        for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
        }
        for (int j = 0; j < a; j++) {
            System.out.print("*");
        }
    }


    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
