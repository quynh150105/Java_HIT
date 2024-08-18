package kiemtrabai2;

public class Product {
	private String product_id;
	private String product_name;
	private Double product_price;
	private int product_total;
	
	public Product(String product_id, String product_name, Double product_price, int product_total ) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.setProduct_price(product_price);
		this.setProduct_total(product_total);
	}
	
	public Product() {
		
	}
	
	public void setproduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getproduct_id() {
		return product_id;
	}
	
	public void setproduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getproduct_name() {
		return product_name;
	}
	
	public void setproduct_price(Double prproduct_price) {
		this.setProduct_price(product_price);
	}
	public Double getproduct_price() {
		return getProduct_price();
	}
	
	public void setproduct_total(int product_total) {
		this.setProduct_total(product_total);
	}
	public int getproduct_total() {
		return getProduct_total();
	}
	
	public Double getTotalPrice() {
		return getProduct_price() * getProduct_total();
	}
	
	public void toStrig() {
		System.out.printf("%15s %15s 15%s 15%s", product_id, product_name, getProduct_price(), getProduct_total());
		
	}

	public Double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}

	public int getProduct_total() {
		return product_total;
	}

	public void setProduct_total(int product_total) {
		this.product_total = product_total;
	}

}
