package Program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    static int one;
    static int two;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            reader.close();
            int i1 = s.indexOf(' ');
            int i2 = s.indexOf(' ', i1 + 1);

            String num1 = s.substring(0, i1);               //Получаем первое значение
            String num2 = s.substring(i2 + 1);              //Получаем второе значение
            String sign = s.substring(i1 + 1, i2);          //Получаем знак арифметической операции

            Check.NumberCheck(num1, num2);                  //Проверяем на одинаковые числовые системы

            one = Integer.parseInt(Roman.RoToAr(num1));     //Переводим первое значение в число
            two = Integer.parseInt(Roman.RoToAr(num2));     //Переводим второе значение в число

            System.out.println(Arithmetic.ArithmeticOperation(sign)); //Выводим результат арифметической операции

        } catch (NumberGreaterThanTen e) {
            System.out.println("Ошибка: числа не соответствуют условиям задачи");
        } catch (NullArOper e) {
            System.out.println("Ошибка: пропущен знак арифметической операции");
        } catch (WrongArOper e) {
            System.out.println("Ошибка: неверный знак арифметической операции");
        } catch (InconsistencyException e) {
            System.out.println("Ошибка: цифры из разных числовых систем");
        } catch (Exception e) {
            System.out.println("Ошибка: условия задачи не соблюдены");

        }


    }
}