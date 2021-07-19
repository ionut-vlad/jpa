package com.jpa.controllers;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.university.FilmEntity;
import com.jpa.services.FilmService;

@RestController
public class FilmController {
	
	@Autowired
	FilmService filmService;
	
	@GetMapping(value="/createF", produces ="application/json") 
	public String createObject(){ 
		filmService.createFilmWithName("name");
		return "random";
	}
	
	@GetMapping(value = "/getAllFilms")
	public List<FilmEntity> getAllFilms() {
	    return filmService.getAllFilms();
	}
	

    @GetMapping(value = "/getFilmByName/{filmName}")
    public FilmEntity getFilmByName(@PathVariable String filmName) {
        return filmService.getFilmByName(filmName);
    }
	
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "/film")
    public FilmEntity getFilmByNameAgain(@PathParam(value = "name") String name, @PathParam(value = "director") String director ) {
      
    	return filmService.getFilmByNameAndDirector(name,director);
    	
    }
    
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "/getFilms")
    public String getFilmByNameAndDirectorAgain(@PathParam(value = "name") String name, @PathParam(value = "director") String director ) {
       return " My name is " + name + " and my director is " + director;
    
    }

    
}
