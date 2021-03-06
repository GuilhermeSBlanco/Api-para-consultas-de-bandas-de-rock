package br.com.arthurschultz.bands.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.arthurschultz.bands.model.Band;
import br.com.arthurschultz.bands.Service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping("/band")
public class BandController {
    @Autowired
    private BandService bandService;

    @GetMapping
    public String formInsert(@ModelAttribute Band newBand) {
        return "pages/insertBand";
    } 

    @PostMapping
    public ResponseEntity<String> Insert() {
        return new ResponseEntity<>("pages/erro", HttpStatus.BAD_REQUEST);   
    }  
}
