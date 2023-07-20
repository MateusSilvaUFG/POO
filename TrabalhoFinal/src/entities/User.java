package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;



public class User extends Comment {
	
	private String email;
	private String password;
	private String name;
	private String birthdate;
	private String relationship;
	
	private List<Marketplace> marketplace;
	private List<Marketplace> post;
	private List<Marketplace> followers;
	private List<Marketplace> dev;
	private List<Marketplace> game;
	
	LocalDateTime now = LocalDateTime.now();
	
	DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String date = formatterDate.format(now);
	
	DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
	String time = formatterHora.format(now);
	
	public User() {
		super();
	}
	
	public User(String email, String password, String name, String birthdate, String relationship) {
	super();
	this.email = email;
	this.password = password;
	this.name = name;
	this.birthdate = birthdate;
	this.relationship = relationship;
	this.marketplace = new ArrayList<>();
	this.post = new ArrayList<>();
	this.followers = new ArrayList<>();
	this.dev = new ArrayList<>();
	this.game = new ArrayList<>();
	}
	
	public User(String name, String birthdate, String relationship) {
		this.name = name;
		this.birthdate = birthdate;
		this.relationship = relationship;
		this.marketplace = new ArrayList<>();
		this.post = new ArrayList<>();
		this.followers = new ArrayList<>();
		this.dev = new ArrayList<>();
		this.game = new ArrayList<>();	
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassowrd(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getRelationship() {
		return relationship;
	}
	
	
	
	
	
	
	
	
}
