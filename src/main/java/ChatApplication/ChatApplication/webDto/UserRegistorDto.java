package ChatApplication.ChatApplication.webDto;

public class UserRegistorDto {
	
	public UserRegistorDto(long id,String firstName, String lastName, String email, String password) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		Password = password;
	}
	public UserRegistorDto() {
		// TODO Auto-generated constructor stub
	}
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String Password;
	public long getid() {
		return id;
	}
	public void setid(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
