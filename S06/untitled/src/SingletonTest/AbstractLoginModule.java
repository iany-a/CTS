package SingletonTest;//ACME Inc is developing an authentication system where all login operations must
//be handled through a single shared instance of a login module to ensure consistency and resource efficiency.
//The module must be available when a client will try to login for the first time.

public abstract class AbstractLoginModule {
	String ip;
	String url;
	
	public abstract void login(String username, String password);
}

