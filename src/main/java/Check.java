import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hammer on 20.11.2020.
 */
class Check {
    //шаблон возможных данных
    private static Pattern patternDigital = Pattern.compile("[1-9]|(10)");
    private static Pattern patternRoman = Pattern.compile("(IV)|(IX)|(X)|[I]{1,3}|[V]?+[I]{0,3}");
    private static Pattern patternOperation = Pattern.compile("[+-/*]");
    //массиб для проверки. инициализация при создании экземпляра класса
    private String[] arr;
    //будем обращаться к этой переменной для проверки необходимости перевода из римской в арабскую и обратно
    private boolean roman = false;

    Check(String[] arr) {
        this.arr = arr;
    }

    boolean checkInput() {
        //массив должен содержать трии элемента
        if (arr.length != 3) {
            return false;
        }
        //проверяем на арабский формат
        Matcher dig1 = patternDigital.matcher(arr[0]);
        Matcher op = patternOperation.matcher(arr[1]);
        Matcher dig2 = patternDigital.matcher(arr[2]);
        if (dig1.matches() && op.matches() && dig2.matches()) {
            return true;
        }
        //если не арабский то проверяем на римский формат
        Matcher rim1 = patternRoman.matcher(arr[0]);
        Matcher rim2 = patternRoman.matcher(arr[2]);
        if (rim1.matches() && op.matches() && rim2.matches()) {
            roman = true;
            return true;
        }
        //данные не верны- расчёт не получится. добавить обработчик
        return false;
    }

    boolean isRoman() {
        return roman;
    }
}