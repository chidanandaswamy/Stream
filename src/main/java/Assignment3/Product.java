package Assignment3;

public class Product {

	int productId;
	String Name;
	float cost;

	
	public Product() {
		
	}
	
	public Product(int productId, String name, float cost) {
		
		this.productId = productId;
		Name = name;
		this.cost = cost;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", Name=" + Name + ", cost=" + cost + "]";
	}
	
	  
}
