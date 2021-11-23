package hanifiamdev.com.lambda.util;

public class StringUtil {

    public static boolean isLoweCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    };
}
