package com.music.shop.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.music.shop.dto.SongDTO;
import com.music.shop.mappers.SongMapper;
import com.music.shop.model.Song;
import com.music.shop.repository.SongRepository;

@Service
@Transactional
public class SongService {

	private final SongRepository Repo;
	private final SongMapper Map;
	
	
	public SongService(SongRepository repo, SongMapper map) {
		super();
		Repo = repo;
		Map = map;
	}
	
	// Service logic to find all elements 
	public List<SongDTO> findAll(){
		return Repo.findAll().stream().map(m -> Map.toDTO(m)).collect(Collectors.toList());
	}
	
	// service logic to find element by using id 
	public SongDTO findById(Long id) {
		Optional<Song> mats = Repo.findById(id);
		if (mats.isPresent()) {
			return Map.toDTO(mats.get());
		}
		return null;
	}
	
	// service logic to save an element 
	public SongDTO save(SongDTO mats) {
		Song entity = Map.toEntity(mats);
		Song saved = Repo.save(entity);
		return Map.toDTO(saved);
	}
	
	// service logic to update an already existing element/resource.
   // No song ? just albums . 
	public SongDTO update(SongDTO mats ) {
		Long id = mats.getId();
		Optional<Song> findById = Repo.findById(id);
		if (findById.isPresent()) {
			
			Song updatedMats = findById.get();
			updatedMats.setName(mats.getName());
			updatedMats.setAlbums(mats.getAlbums());
			updatedMats.setSongs(mats.getSongs());
			updatedMats.setPrice(mats.getPrice());
			updatedMats.setGenreType(mats.getGenreType());
			updatedMats.setId(mats.getId());
			
			Song saved = Repo.save(updatedMats);
			return Map.toDTO(saved);
		}else {
			throw new IllegalArgumentException();
			
		}
		
	}
	
	// service logic to delete by using id elements 
	
	public void deleteById(Long id) {
		Repo.deleteById(id);
	}
	
}
