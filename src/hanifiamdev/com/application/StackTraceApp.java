package hanifiamdev.com.application;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            String[] names = {
                    "Hanif", "Hafizah", "Orkhan"
            };

            System.out.println(names[100]);
        }catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }
}
