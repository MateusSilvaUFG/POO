package entities;

public class Comment {
	private Integer id;
	private User user;
	private String text;
	
	public Comment() {
		super();
	}
	
	public Comment(Integer id, User user, String text) {
		super();
		this.id = id;
		this.user = user;
		this.text = text;
	}
	
	public Comment(Integer id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	
	public Integer getid() {
		return id;
	}
	
	public void setid(Integer id) {
		this.id = id;
	}
	
	public User getuser() {
		return user;
	}
	
	public void setuser(User user) {
		this.user = user;
	}
	
	public String getString() {
		this.text = text;
	}
	
}
