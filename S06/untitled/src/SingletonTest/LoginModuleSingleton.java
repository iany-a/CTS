package SingletonTest;

public class LoginModuleSingleton extends AbstractLoginModule {

    private static LoginModuleSingleton loginModuleSingleton = null;
    //private String username; this is wrong
    //private String password;

    private LoginModuleSingleton(){
        System.out.println("Init login..");
        //this.username = "N/A"; this is wrong
        //this.password = "N/A";
        this.ip = "127.0.0.1";
        this.url = "online.ase.ro";
    }

    public static synchronized LoginModuleSingleton getModule(){
        if (LoginModuleSingleton.loginModuleSingleton == null){
            LoginModuleSingleton.loginModuleSingleton = new LoginModuleSingleton();
        }

//        if (loginModuleSingleton == null){ //shortcut
//            loginModuleSingleton = new SingletonTest.LoginModuleSingleton();
//        }

        return LoginModuleSingleton.loginModuleSingleton;
        //return loginModuleSingleton;
    }

    @Override
    public void login(String username, String password) {
        System.out.println("Login for " + username);

    }
}
