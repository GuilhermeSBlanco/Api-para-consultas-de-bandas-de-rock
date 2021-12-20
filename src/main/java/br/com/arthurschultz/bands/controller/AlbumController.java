package br.com.arthurschultz.bands.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.arthurschultz.bands.Service.BandService;
import br.com.arthurschultz.bands.model.Band;

@Controller
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    private BandService bandService;

    @GetMapping
    public String formInsert(Model model) {
        return "pages/insertAlbum";
    }

    @PostMapping
    public ResponseEntity<String> Insert() {
        return new ResponseEntity<>("pages/erro", HttpStatus.BAD_REQUEST);   
    } 
}
