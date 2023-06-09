public class ArabInRom {


    public  String convert(int in) {
        StringBuffer a = new StringBuffer("");
        // Выделяем тысячи
        int m1 = in / 1000;
        a.append(M(m1));
        // то что осталось после тысяч
        int m2 = in % 1000;

        // Выделяем пятьсот из остатка от тысячи
        int d1 = m2 / 500;
        a.append(D(d1));
        // остаток после выделения полтысячи
        int d2 = m2 % 500;

        // Выделяем сотни из остатка
        int c1 = d2 / 100;
        a.append(C(c1));
        // остаток из сотен
        int c2 = d2 % 100;

        // Выделяем полсотни
        int l1 = c2 / 50;
        a.append(L(l1));
        // остаток
        int l2 = c2 % 50;

        // Выделяем десятки
        int x1 = l2 / 10;
        a.append(X(x1));
        // остаток
        int x2 = l2 % 10;

        // Выделяем то что осталось
        a.append(basic(x2));
        return a.toString();
    }

    // преобразовываем целые тысячи
    // с значениями,кратными десяти, но не 5,всё просто
    private static String M(int in) {
        StringBuffer a = new StringBuffer("");
        int i = 0;
        while (i < in) {
            a.append("M");
            i++;
        }
        return a.toString();
    }
    // преобразовываем целые сотни
    private static String C(int in) {
        if (in == 4) return "CD"; //если 400, то 500-100
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("C");
                i++;
            }
            return a.toString();
        }
        else return "";
    }

// целые десятки

    private static String X(int in) {
        if (in == 4) return "XL"; // если 40, то 50-10
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("X");
                i++;
            }
            return a.toString();
        }
        else return "";
    }
    // преобразовываем пол тысячи
    private static String D(int in) {

        if (in == 4 ) return "CM"; // если 900, то 1000-100
        else if (0 < in && in < 4 ) return "D";
        else return "";

    }


    private static String L(int in) {
        if (in == 4) return "XC"; // если90 то100 - 10
        else if (0 < in && in < 4)
        return "L";
        else return "";

    }
    // От 1 до 9, то что осталось
    private static String basic(int in) {
        String[] a = {
                "",
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX"
        };
        return a[in];
    }

}