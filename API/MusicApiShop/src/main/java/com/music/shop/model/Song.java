package com.music.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Music")
public class Song {
	
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "Artist_name")
	private String name;
	@Column(name = "Genre_type")
	private String genreType;
	
	
	private String Albums;
	private String Songs;
	private String price;
	
	
	
	

	public Song() {
		
		}
	
	public Song(Long id, String name, String genreType, String albums,String songs,  String price) {	
		
		
		this.id = id;
		this.name = name;
		this.genreType = genreType;
		this.Albums = albums;
		this.Songs = songs;
		this.price = price;
	}
	
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
	
	public String getSongs() {
		return Songs;
	}

	public void setSongs(String songs) {
		Songs = songs;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", genreType=" + genreType + ", Albums=" + Albums + ", Songs="
				+ Songs + ", price=" + price + "]";
	} 
	
	
}
