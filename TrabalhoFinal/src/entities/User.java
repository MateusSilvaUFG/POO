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
	private List<Post> posts;
	private List<Follow> followers;
	private List<DevEvents> dev;
	private List<GameEvents> game;
	
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
	this.posts = new ArrayList<>();
	this.followers = new ArrayList<>();
	this.dev = new ArrayList<>();
	this.game = new ArrayList<>();
	}
	
	public User(String name, String birthdate, String relationship) {
		this.name = name;
		this.birthdate = birthdate;
		this.relationship = relationship;
		this.marketplace = new ArrayList<>();
		this.posts = new ArrayList<>();
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
	
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	public List<Marketplace> getMarketplace(){
		return marketplace;
	}
	
	public List<Post> getPosts(){
		return posts;
	}
	
	public List<Follow> getfollowers(){
		return followers;
	}
	
	public List<DevEvents> getDev(){
		return dev;
	}
	
	public List<GameEvents> getGame(){
		return game;
	}
	
	// Marketplace
	
	public void showMaker() {
		for(int i = 0; i< marketplace.size(); i++) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(
					"#" + marketplace.get(i).getId() + "-" + marketplace.get(i).getProduct() + "Posted by" + name);
			System.out.println("Price ($) " + marketplace.get(i).getPrice());
			System.out.println("Description: " + marketplace.get(i).getDescription());
			System.out.println();
			System.out.println();
			marketplace.get(i).showComments();
			System.out.println();
		}
	}
	
	public void showYourMarket() {
		for(int i = 0; i < marketplace.size(); i++) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(
					"#" + marketplace.get(i).getId() + "-" + marketplace.get(i).getProduct() + "Posted by" + name);
			System.out.println("Price ($) " + marketplace.get(i).getPrice());
			System.out.println("Description: " + marketplace.get(i).getDescription());
			System.out.println();
		}
	}
	
	public void addProduct(User user, Integer id, String product, Double price, String description) {
		marketplace.add(new Marketplace(user, id, product, price, description));
	}
	
	public void editProductName(Integer id, String prouct) {
		for(int i = 0; i < marketplace.size(); i++) {
			if( marketplace.get(i).getId() == id) {
				marketplace.get(i).setProduct(prouct);
			}
		}
	}
	
	public void editProductPrice(Integer id, Double price) {
		for(int i = 0; i < marketplace.size(); i++) {
			if( marketplace.get(i).getId() == id) {
				marketplace.get(i).setPrice(price);
			}
		}
	}
	
	public void editProductDescription(Integer id, String description) {
		for(int i = 0; i < marketplace.size(); i++) {
			if( marketplace.get(i).getId() == id) {
				marketplace.get(i).setDescription(description);
			}
		}
	}
	
	public void removeProduct(Integer id) {
		for(int i = 0; i < marketplace.size(); i++) {
			if( marketplace.get(i).getId() == id) {
				marketplace.remove(i);
			}
		}
		System.out.println();
		System.out.println("(PRODUCT DELETED)");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	// POSTS
	
	public void showPosts() {
		
	for(int i = 0; i< posts.size(); i++) {
		System.out.println();
		System.out.println("Posts #" + posts.get(i).getIdPost() + "by" + name + " on " + date + " at " + time);
		System.out.println("  " + posts.get(i).getContent());
		System.out.println();
		posts.get(i).showComments();
		System.out.println();
		}
	}
	
	public void showYourPosts() {
		for(int i = 0; i < posts.size(); i++) {
			System.out.println();
			System.out.println("Posts #" + posts.get(i).getIdPost() + "by" + name + " on " + date + " at " + time);
			System.out.println("  " + posts.get(i).getContent());
			System.out.println();
		}
	}
	
	public void addPost(User user, Integer idPost, String content) {
		posts.add(new Post(user, idPost, content));
	}
	
	public void editPost(Integer idPost, String content) {
		for(int i = 0; i < posts.size(); i++) {
			if( posts.get(i).getIdPost() == idPost) {
				posts.get(i).setContent(content);
			}
		}
	}
	
	public void removePost(Integer idPost) {
		for(int i = 0; i < posts.size(); i++) {
			if( posts.get(i).getIdPost() == idPost) {
				posts.remove(i);
			}
	
		System.out.println();
		System.out.println("(POST DELETED)");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
	
	// FRIENDS
	
	public void showFollowens() {
		for (int i = 0; i < followers.size(); i++) {
			System.out.println();
			System.out.println("#" + followers.get(i).getName() + ", Birthday: " + followers.get(i).getBirthdate()
					+ ", Relationship status: " + followers.get(i).getRelationship());
		}
	}
	
	public void showFriends() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("                                                                 {FRIENDS}");
		for(int i = 0; i < followers.size(); i++) {
			System.out.println(followers.get(i).getName() + " / ");
		}
		System.out.println();
	}
	
	public void follow(String name, String birthdate, String relationship) {
		followers.add(new Follow(name, birthdate, relationship));
		System.out.println("{FRIEND ADDED");
	}
	
	public void unfollow(String nameFollower) {
		for (int i = 0; i < followers.size(); i++) {
			if (followers.get(i).getName().contentEquals(nameFollower)) {
				followers.remove(i);
				System.out.println("{FRIEND REMOVED!}");
	 		} else {
				System.out.println("{YOU DON'T HAVE A FRIEND WITH THIS NAME");
			}
		}
	}
	
	// DEV EVENTS
	
	public void showDevEvents() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for( int i = 0; i < dev.size(); i++) {
			System.out.println();
			System.out.println("Dev Event #" )
		}
	}
}
