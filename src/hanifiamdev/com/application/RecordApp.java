package hanifiamdev.com.application;

import hanifiamdev.com.data.LoginRequest;

public class RecordApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("hanif", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("hanif"));
        System.out.println(new LoginRequest("hanif", "rahasia"));
    }
}
