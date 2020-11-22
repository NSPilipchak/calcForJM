import java.util.Scanner;

/**
 * Created by hammer on 20.11.2020.
 */
class InputLine {
    String str;

    InputLine() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
        str = in.nextLine();
    }

    String[] split(String splitter) {
        return str.split(splitter);
    }
}
