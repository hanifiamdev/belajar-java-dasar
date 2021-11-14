package hanifiamdev.com.util;

import hanifiamdev.com.data.MasterUser;
import hanifiamdev.com.error.BlankException;
import hanifiamdev.com.error.ValidationException;

public class ValidationUtil {

    public static void validate(MasterUser masterUser) throws ValidationException {
        if(masterUser.getUsername() == null) {
            throw new NullPointerException("Username is null");
        }else if(masterUser.getUsername().isBlank()) {
            throw new ValidationException("Username is blank");
        }else if(masterUser.getPassword() == null) {
            throw new NullPointerException("Password is null");
        }else if(masterUser.getUsername().isBlank()) {
            throw new ValidationException("Password is blank");
        }

    }

    public static void validateRuntime(MasterUser masterUser) { // Untuk runtime exception nggak wajib melakukan deklarasi  throws di method yang memanggilnya  seperti checked exception
        if(masterUser.getUsername() == null) {
            throw new NullPointerException("Username is null");
        }else if(masterUser.getUsername().isBlank()) {
            throw new BlankException("Username is blank");
        }else if(masterUser.getPassword() == null) {
            throw new NullPointerException("Password is null");
        }else if(masterUser.getUsername().isBlank()) {
            throw new BlankException("Password is blank");
        }

    }
}
