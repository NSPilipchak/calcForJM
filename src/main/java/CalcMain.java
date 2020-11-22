/**
 * Created by hammer on 20.11.2020.
 */
public class CalcMain {

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        int a, b;
        String op;
        //Выносим сканер в отдельный класс.
        InputLine input = new InputLine();
        //Переводим полученную строку в массив
        String[] arr = input.split(" ");
        //создаем экземпляр класса CheckInput для проверки строки
        Check check = new Check(arr);
        //Проверяем на соответсвие введеных данных в массиве после сплита строки. Массив долден состоять из трех элементов
        //если проверка проходит заполняем переменные.
        if (check.checkInput() && check.isRoman()) {
            a = ConvertDigital.toArabic(arr[0]);
            op = arr[1];
            b = ConvertDigital.toArabic(arr[2]);
            int ret = Calculate.calc(a, op, b);
            System.out.println("Output:\n" + ConvertDigital.toRoman(ret));
        } else if (check.checkInput() && !check.isRoman()) {
            a = Integer.parseInt(arr[0]);
            op = arr[1];
            b = Integer.parseInt(arr[2]);
            System.out.println("Output:\n" + Calculate.calc(a, op, b));
        } else {
            System.out.println("Error: Wrong data");
        }
        // повторяем запрос уровнения
//        start();
    }
}
