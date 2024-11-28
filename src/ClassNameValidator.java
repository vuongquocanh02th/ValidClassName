import java.util.Scanner;
import java.util.regex.*;
public class ClassNameValidator {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Class name:");
        String className = scanner.nextLine();
        System.out.println(isValidClassName(className));
    }
}
