package SingletonTest;

public class testLogin {
    public static void main(String[] args) {
        LoginModuleSingleton login = LoginModuleSingleton.getModule();
        login.login("admin", "1234");
    }
}

