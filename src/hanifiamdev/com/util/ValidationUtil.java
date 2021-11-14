package hanifiamdev.com.util;

import hanifiamdev.com.annotation.NotBlank;
import hanifiamdev.com.data.MasterUser;
import hanifiamdev.com.error.BlankException;
import hanifiamdev.com.error.ValidationException;

import java.lang.reflect.Field;

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

    //digunakan di materi reflection
    public static void validationReflection(Object object)  {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields) {
            field.setAccessible(true); // klw fieldnya ada yang tidak bisa diaksaes/ di set private, gunakan ini untuk memaksa agar tetap bisa diakses

            if(field.getAnnotation(NotBlank.class) != null) {
                // validated
                try {
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }


            }

        }
    }

}
