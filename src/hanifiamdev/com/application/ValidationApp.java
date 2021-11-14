package hanifiamdev.com.application;

import hanifiamdev.com.data.MasterUser;
import hanifiamdev.com.error.ValidationException;
import hanifiamdev.com.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        MasterUser masterUser = new MasterUser(null, "rahasia");
        // try catch
        try{
            ValidationUtil.validate(masterUser);
            System.out.println("Data Valid");
        }catch (ValidationException e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        }catch (NullPointerException e) {
            System.out.println("Data Null : " + e.getMessage());
        }

        // mutiple try catch
        try{
            ValidationUtil.validate(masterUser);
            System.out.println("Data Valid");
        }catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }
    }
}
