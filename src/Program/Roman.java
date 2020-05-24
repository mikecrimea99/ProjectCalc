package Program;

public class Roman {
    static String[] strings = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static int[] ints = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String ArToRo(int i) {
        String result = "";
        for (int j = 0; j < strings.length; j++) {
            while (i >= ints[j]) {
                result += strings[j];
                i -= ints[j];
            }
        }
        return result;
    }

    public static String RoToAr(String s) throws NumberGreaterThanTen {
        String[] list = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (s.equals(list[i])) {
                s = String.valueOf(i + 1);
            }
        }
        for (int j = 1; j < 11; j++) {
            if (s.equals(String.valueOf(j))) {
                count++;
            }
        }
        if (count == 1) {
            return s;
        } else
            throw new NumberGreaterThanTen("Ошибка: одно или оба числа не соответствуют условиям задачи");

    }
}


