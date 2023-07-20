package entities;

public class Marketplace {
	private User = user;
	private Integer id;
	private String product;
	private double price;
	private String description;
	
	private List<Comment> comment;

	LocalDateTime  now = LocalDateTime.now();

	DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	String date = formatterData.format(now);
	
	DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
	String time = formatterHora.forma(now);
	
	public Marketplace() {
		super();
	}
	
	public marketplace(User user, Integer id, String product, double price, String description) {
	super();
	this.user = user;
	this.id = id;
	this.product = product;
	this.price = price;
	this.description = description;
	this.comments = new ArrayList<>();
	}
	
	public Marketplace(Integer id, String product, Double price, String description) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
		this.description = description;
		this;comments = new ArrayList<>();
	}
	
	public Marketplace(Integer id) {
		super();
		this.id = id;
		this.comments = new ArrayList<>();
	}
	
	public User getUser() {
		return user;
	}
	
	public Integer getid() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		
	}
	
	
}

