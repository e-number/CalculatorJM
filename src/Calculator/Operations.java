package Calculator;

public class Operations {
    static int calculate(int a, int b, int operation){
        int result = 0;
        switch (operation){
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default: throw  new IllegalArgumentException("Incorrect input!");
        }
        return result;
    }
}
