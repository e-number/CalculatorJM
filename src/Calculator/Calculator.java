package Calculator;

import java.util.Scanner;

import static Calculator.RomeNumb.decimalToRoman;
import static Calculator.RomeNumb.romanToDecimal;

class Calculator extends Operations {

    public static void main(String[] args) {
        System.out.println("Please enter an input:");

        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int operation = line[1].charAt(0);
        int a, b;
        boolean flag1 = false, flag2 = false;
        if (line.length != 3) {
            throw new IllegalArgumentException("Incorrect input!");
        }
        try {
            for (int i = 0; i < roman.length; i++) {
                if (roman[i].equals(line[0])) {
                    flag1 = true;
                }
                if (roman[i].equals(line[2])) {
                    flag2 = true;
                }

            }
            if (flag1 && flag2) {
                a = romanToDecimal(line[0]);
                b = romanToDecimal(line[2]);
                if ((a > 10 || a < 1) || (b > 10 || b < 1)) {
                    throw new IllegalArgumentException("Incorrect input!");
                }
                System.out.println(decimalToRoman(calculate(a, b, operation)));

            } else if (!flag1 && !flag2) {
                try {
                    a = Integer.parseInt(line[0]);
                    b = Integer.parseInt(line[2]);
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Incorrect input!");
                }
                if ((a > 10 || a < 1) || (b > 10 || b < 1)) {
                    throw new IllegalArgumentException("Incorrect input!");
                }
                System.out.println(calculate(a, b, operation));
            } else {
                throw new IllegalArgumentException("Incorrect input!");
                }
            } catch (RuntimeException e) {
            throw new IllegalArgumentException("Incorrect input!");
        }
    }
}
