package spring.com.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {

	@Id
	@Column(name="St_Id",length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sId;
	
	@Column(name="fullname" ,length = 200)
	private String fullname;
	
	@Column(name="St_name",length = 255)
	private String username;

	@Column(name="St_email",length = 100)
	private String email;
	
	@Column(name="St_contact",length = 20)
	private String contact;
	
	@Column(name = "password" , length = 200)
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
		return "Student [sId=" + sId + ", fullname=" + fullname + ", username=" + username + ", email=" + email
				+ ", contact=" + contact + ", password=" + password + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String fullname, String username, String email, String contact, String password) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.contact = contact;
		this.password = password;
	}
	
	
}
