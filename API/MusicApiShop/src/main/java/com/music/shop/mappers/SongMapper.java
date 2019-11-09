package com.music.shop.mappers;

import org.springframework.stereotype.Component;

import com.music.shop.dto.SongDTO;
import com.music.shop.model.Song;

@Component
public class SongMapper {
	
	public Song toEntity(SongDTO dto) {
		
		
		Song song = new Song();
		song.setName(dto.getName());
		song.setAlbums(dto.getAlbums());
		song.setGenreType(dto.getGenreType());
		song.setPrice(dto.getPrice());
		song.setSongs(dto.getSongs());
		return song;
	
		
	}

	
	public SongDTO toDTO(Song entity) {
		
		
		SongDTO song = new SongDTO();
		song.setId(entity.getId());
		song.setName(entity.getName());
		song.setPrice(entity.getPrice());
		song.setAlbums(entity.getAlbums());
		song.setSongs(entity.getSongs());
		song.setGenreType(entity.getGenreType());
		return song;
		
		
	}
	
	
}
