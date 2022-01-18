import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        int[] mass = fillMass(20);
        int max = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max) max = mass[i];
        }
        System.out.println(max);
    }

    private int[] fillMass(int n) {
        int[] mass = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mass[i] = random.nextInt(100);
        }
        return mass;
    }
}
