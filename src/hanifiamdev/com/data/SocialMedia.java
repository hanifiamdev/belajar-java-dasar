package hanifiamdev.com.data;

class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {

    }
}

class FakeFacebook extends Facebook {

   /* void login(String username, String password) { //ERROR -> tibak bisa di oveeride karena mehod login merupakan fianl method

    }*/
}
