package enums;

public enum PasswordsEnums {
	ADMINISTRATOR_PASSWORD("pass"), REGULAR_USER_PASSWORD("password5");
	
	private String password;
	
	private PasswordsEnums(String passwords) {
		this.password = passwords;
	}
	
	public String getPassword(){
		return this.password;
	}
}
