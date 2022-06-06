package com.product.cache.api.output;

public class ProductType {

	private Integer id;
	private String productTypeName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public ProductType() {
	}

	public ProductType(Integer id, String productTypeName) {
		super();
		this.id = id;
		this.productTypeName = productTypeName;
	}

	@Override
	public String toString() {
		return "ProductType [id=" + id + ", productTypeName=" + productTypeName + "]";
	}

}
