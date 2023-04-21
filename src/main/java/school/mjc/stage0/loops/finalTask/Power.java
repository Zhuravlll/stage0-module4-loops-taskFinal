package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int base = numberToPrint;
        int result = 1;
        for (int i = power; i>0; i--) {
            result *= base;
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
