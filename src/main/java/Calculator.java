import java.util.List;

public class Calculator {


    public int sum(int a, int b) {
        return a + b;
    }

    public static double divideNumbers(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Список чисел не может быть пустым!");
        }

        double result = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            double divisor = numbers.get(i);
            if (divisor == 0) {
                throw new ArithmeticException("Деление на ноль невозможно!");
            }
            result /= divisor;
        }

        return result;
    }
}
