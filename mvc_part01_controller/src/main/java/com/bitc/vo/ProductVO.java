package com.bitc.vo;

public class ProductVO {
	private String name;
	private int price;

	public ProductVO() {
		System.out.println("기본 생성자");
	}

	public ProductVO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
