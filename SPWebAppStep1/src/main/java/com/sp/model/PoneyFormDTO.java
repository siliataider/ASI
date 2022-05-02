package com.sp.model;

public class PoneyFormDTO  {

	private String color;
	private String superPower;
	private String name;
	private String imgUrl;


	public PoneyFormDTO() {
		this.color = "";
		this.superPower = "";
		this.name = "";
		this.imgUrl="";
	}
	public PoneyFormDTO(String name,String color,String superPower, String imgUrl) {
		this.color = color;
		this.superPower = superPower;
		this.name = name;
		this.imgUrl=imgUrl;
	}

    // GETTER AND SETTER
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getSuperPower() {
		return this.superPower;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @param superPower the superPower to set
	 */
	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}
	/**
	 * @param name the name to set
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	
}

