package Program;

public class Arithmetic {
    public static String ArithmeticOperation(String s) throws WrongArOper, NullArOper {
        int answer = 0;
        switch (s) {
            case "+":
                answer = Calculator.one + Calculator.two;
                break;
            case "-":
                answer = Calculator.one - Calculator.two;
                break;
            case "*":
                answer = Calculator.one * Calculator.two;
                break;
            case "/":
                answer = Calculator.one / Calculator.two;
                break;
            case " ":
                throw new NullArOper("Ошибка: пропущен знак арифметической операции");

            default:
                throw new WrongArOper("Ошибка: неверный знак арифметической операции");
        }
        if (Check.count != 0) {
            return String.valueOf(answer);
        } else return Roman.ArToRo(answer);
    }
}
