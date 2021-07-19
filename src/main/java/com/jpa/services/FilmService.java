package com.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.university.FilmEntity;
import com.jpa.repository.FilmRepository;

@Service
public class FilmService {
    
	@Autowired
    FilmRepository filmRepo;
    
    public List<FilmEntity> getAllFilms() {
        return filmRepo.findAll();
    }
    
    public void createFilmWithName(String name) {
        filmRepo.save(new FilmEntity().setName(name));
        filmRepo.findByNameIgnoreCase(name);
    }

    public FilmEntity getFilmByName(String filmName) {
        return filmRepo.findByNameIgnoreCase(filmName);
    }
    
    public FilmEntity getFilmByNameAndDirector(String filmName, String filmDirector) {
        return filmRepo.findByNameAndDirector(filmName,filmDirector);
    }

}
