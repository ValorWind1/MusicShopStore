package com.music.shop.controller;

import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.music.shop.dto.SongDTO;
import com.music.shop.services.SongService;

@RestController
public class SongController {
	
	
	private final SongService service;

	public SongController(SongService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping("/api/albumns")
	public List<SongDTO> getAll(){
		return service.findAll();
	}
	
	@GetMapping("/api/albumns/{id}")
	public ResponseEntity<SongDTO> getById(@PathVariable long id){
		SongDTO song = service.findById(id);
		
		return ResponseEntity.ok(song);
	}
	
	@PostMapping("/api/albumns")
	public ResponseEntity<SongDTO> post (@RequestBody @Valid SongDTO albumns) throws URISyntaxException {
		
		SongDTO result = service.update(albumns);
		return ResponseEntity.ok().body(result);
		
	}
	
	
	@DeleteMapping ("/api/albumns/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
}
