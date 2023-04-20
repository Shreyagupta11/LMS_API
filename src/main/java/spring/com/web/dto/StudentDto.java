package spring.com.web.dto;



public class StudentDto {

	private int sId;
	
	private String fullname;

	private String username;

	private String email;
	
	private String contact;
	
	private String password;

	

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "StudentDto [sId=" + sId + ", fullname=" + fullname + ", username=" + username + ", email=" + email
				+ ", contact=" + contact + ", password=" + password + "]";
	}

	public StudentDto( String fullname, String username, String email, String contact, String password) {
		super();
		
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.contact = contact;
		this.password = password;
	}
	
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
