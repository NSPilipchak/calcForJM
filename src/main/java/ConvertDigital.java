import java.util.TreeMap;

/**
 * Created by hammer on 21.11.2020.
 */
class ConvertDigital {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    static String toRoman(int number) {
        int dig = map.floorKey(number);
        if (number == dig) {
            return map.get(number);
        }
        return map.get(dig) + toRoman(number - dig);
    }

    static int toArabic(String digit) {
        int ret = 0;
        switch (digit) {
            case "I":
                ret = 1;
                break;
            case "II":
                ret = 2;
                break;
            case "III":
                ret = 3;
                break;
            case "IV":
                ret = 4;
                break;
            case "V":
                ret = 5;
                break;
            case "VI":
                ret = 6;
                break;
            case "VII":
                ret = 7;
                break;
            case "VIII":
                ret = 8;
                break;
            case "IX":
                ret = 9;
                break;
            case "X":
                ret = 10;
                break;
        }
        return ret;
    }
}
