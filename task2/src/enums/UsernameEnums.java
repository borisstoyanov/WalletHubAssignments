package enums;

public enum UsernameEnums {
	ADMINISTRATOR("admin"), REGULAR_USER("guest"), MODERATOR("moderator");

	private String username;
	
	private UsernameEnums(String username) {
		this.username = username;
	}
	
	public String getUsername(){
		return this.username;
	}
}
