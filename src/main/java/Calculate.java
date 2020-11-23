/**
 * Created by hammer on 21.11.2020.
 */
class Calculate {

    static int calc(int a, String op, int b) {
        int ret = 0;
        switch (op) {
            case "+":
                ret = a + b;
                break;
            case "-":
                ret = a - b; 
                break;
            case "*":
                ret = a * b;
                break;
            case "/":
                ret = a / b;
                break;
        }

        return ret;
    }
}
