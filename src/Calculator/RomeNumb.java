package Calculator;

public class RomeNumb {

    private static int value(int romeNumb) {
        if (romeNumb == 'I')
            return 1;
        if (romeNumb == 'V')
            return 5;
        if (romeNumb == 'X')
            return 10;
        if (romeNumb == 'L')
            return 50;
        if (romeNumb == 'C')
            return 100;
        return -1;
    }

    static int romanToDecimal(String str) {

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
            if(s1 == -1) {
                throw new IllegalArgumentException("Incorrect input!");
            }
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));
                if(s2 == -1) {
                    throw new IllegalArgumentException("Incorrect input!");
                }
                if (s1 >= s2) {
                    result = result + s1;
                } else {
                    result = result + s2 - s1;
                    i++;
                }
            } else {
                result = result + s1;
                i++;
            }
        }
        return result;
    }

    public static String decimalToRoman(int num)
    {
        String c[] = {"", "C"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String hundereds = c[(num%1000)/100];
        String tens = x[(num%100)/10];
        String ones = i[num%10];

        String answer = hundereds + tens + ones;

        return answer;
    }

}
