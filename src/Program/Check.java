package Program;

public class Check {
    static int count = 0;

    public static void NumberCheck(String s1, String s2) throws InconsistencyException, NumberGreaterThanTen {
        for (int j = 1; j <= 10; j++) {
            if (s1.equals(String.valueOf(j))) {
                count++;
            }
        }
        for (int y = 1; y <= 10; y++) {
            if (s2.equals(String.valueOf(y))) {
                count++;
            }
        }
        if (count != 0 && count != 2) {
            throw new InconsistencyException("Ошибка: цифры из разных числовых систем");
        }
    }
}

