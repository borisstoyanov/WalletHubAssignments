package enums;

public enum PasswordsEnums {
	ADMINISTRATOR_PASSWORD("parola"), REGULAR_USER_PASSWORD("reguserpassword"),
	MODERATOR_PASSWORD("moderatorpass");
	
	private String password;
	
	private PasswordsEnums(String passwords) {
		this.password = passwords;
	}
	
	public String getPassword(){
		return this.password;
	}
}
