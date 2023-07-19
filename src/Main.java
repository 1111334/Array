import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] carBrands = {"Fiat", "Bmw", "Audi", "Maserati", "Ferrari"};

        System.out.println(carBrands.length);

        System.out.println(carBrands[2]);

        int[] primeNumbers = new int[6];
        primeNumbers[0] = 1;
        primeNumbers[1] = 2;
        primeNumbers[2] = 3;
        primeNumbers[3] = 4;
        primeNumbers[4] = 5;
        primeNumbers[5] = 6;

        System.out.println("primeNumbers :" + Arrays.toString(primeNumbers));
    }
}



