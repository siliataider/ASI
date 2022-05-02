package com.sp.model;
public class Poney  {
	public String color;
	public String superPower;
	public String name;
	public String imgUrl;

	public Poney() {
		this.color = "";
		this.superPower = "";
		this.name = "";
		this.imgUrl="";
	}
	public Poney(String name,String color,String superPower, String imgUrl) {
		this.color = color;
		this.superPower = superPower;
		this.name = name;
		this.imgUrl=imgUrl;
	}

  // GETTER AND SETTER
	
	public String getName() {
		return this.name;
	}
}

