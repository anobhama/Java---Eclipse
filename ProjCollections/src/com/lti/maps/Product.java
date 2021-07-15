package com.lti.maps;

public class Product implements Comparable<Product> {
	
	int prodId;
	String prodName;
	float prodCost;

//implements just for tree map(sorting)	
	@Override
	public int compareTo(Product p) {
		
		if(p.getProdId()==this.getProdId())
			return 0;
		else 
			return -1;
	}
	
	public Product() {
		super();
	}

	//generate hashcode to stop the duplicate
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(prodCost);
		result = prime * result + prodId;
		result = prime * result + ((prodName == null) ? 0 : prodName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Float.floatToIntBits(prodCost) != Float.floatToIntBits(other.prodCost))
			return false;
		if (prodId != other.prodId)
			return false;
		if (prodName == null) {
			if (other.prodName != null)
				return false;
		} else if (!prodName.equals(other.prodName))
			return false;
		return true;
	}

	public Product(int prodId, String prodName, float prodCost) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public float getProdCost() {
		return prodCost;
	}

	public void setProdCost(float prodCost) {
		this.prodCost = prodCost;
	}

	@Override
	public String toString() {
		return "Product \n [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}

	
	
	

}
