package homework.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(celsiusToFahrenheit(input.nextDouble()));

        System.out.println(additionalTask(input.nextInt()));

        input.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static int additionalTask(int number) {
        String[] numToArr = (number + "").split("");

        int result = 0;
        for (String value: numToArr) {
            result += Integer.parseInt(value);
        }
        return result;
    }
}
