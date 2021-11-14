package hanifiamdev.com.application;

import hanifiamdev.com.data.CreateUserRequest;
import hanifiamdev.com.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("hanif");
        request.setPassword("rahasia");
        request.setName("fachri");

        ValidationUtil.validationReflection(request);
    }
}
