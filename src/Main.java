import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String string = in.nextLine();
        calc(string);
    }

    public static String calc(String input) {
        String[] string = input.split(" ");
        if (string.length == 3 && Integer.parseInt(string[0]) > 0 && Integer.parseInt(string[0]) < 11
                && Integer.parseInt(string[2]) > 0 && Integer.parseInt(string[2]) < 11) {
            switch (string[1]) {
                case "+":
                    input = String.valueOf(Integer.parseInt(string[0]) + Integer.parseInt(string[2]));
                    System.out.println(input);
                    break;
                case "-":
                    input = String.valueOf(Integer.parseInt(string[0]) - Integer.parseInt(string[2]));
                    System.out.println(input);
                    break;
                case "/":
                        input = String.valueOf(Integer.parseInt(string[0]) / Integer.parseInt(string[2]));
                        System.out.println(input);
                    break;
                case "*":
                    input = String.valueOf(Integer.parseInt(string[0]) * Integer.parseInt(string[2]));
                    System.out.println(input);
                    break;
                default:
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        } else try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return input;
    }
}
