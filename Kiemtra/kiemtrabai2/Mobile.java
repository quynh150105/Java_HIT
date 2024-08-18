package kiemtrabai2;

public class Mobile extends Product {
	private String mobile_manufacturer;
	private String mobile_ram;
	
	public Mobile(String product_id, String product_name, Double product_price, int product_total,String mobile_manufacturer, String mobile_ram) {
		super(product_id,product_name,product_price,product_total);
		this.mobile_manufacturer = mobile_manufacturer;
		this.mobile_ram = mobile_ram;
	}
	
	public void setmobile_manufacturer(String mobile_manufacturer) {
		this.mobile_manufacturer = mobile_manufacturer;
	}
	public String getmobile_manufacturer() {
		return mobile_manufacturer;
	}
	
	public void setmobile_ram(String mobile_ram) {
		this.mobile_ram = mobile_ram;
	}
	public String getmobile_ram() {
		return mobile_ram;
	}
	
	public Double getTotalPrice() {
		return getProduct_total() * getProduct_price();
	}

}
