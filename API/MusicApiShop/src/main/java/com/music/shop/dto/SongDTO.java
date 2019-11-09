package com.music.shop.dto;


public class SongDTO {
	
	private Long id;
	private String name;
	private String genreType;
	private String Albums;
	private String Songs;
	private String price;
	
	
	



	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenreType() {
		return genreType;
	}
	public void setGenreType(String genreType) {
		this.genreType = genreType;
	}
	public String getAlbums() {
		return Albums;
	}
	public void setAlbums(String albums) {
		Albums = albums;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getSongs() {
		return Songs;
	}

	public void setSongs(String songs) {
		Songs = songs;
	}
	

	

}





