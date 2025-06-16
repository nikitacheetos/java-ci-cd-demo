import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(String.valueOf(calculator.sum(1, 3)));


        List<Double> numbers = Arrays.asList(52222133131348123123123.0, 100.0, 5.0, 2.0); // 100 / 5 / 2 = 10
        double result = Calculator.divideNumbers(numbers);
        System.out.println("Результат: " + result); // Результат: 10.0
    }
}
