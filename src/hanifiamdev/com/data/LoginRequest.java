package hanifiamdev.com.data;

public record LoginRequest(String username, String password) { // hanya bisa implements, tidak bisa mealkukan extensds

    //ini contoh untuk default constructor
    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

}
