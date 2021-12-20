package br.com.arthurschultz.bands.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import br.com.arthurschultz.bands.Service.BandService;
import br.com.arthurschultz.bands.Service.AlbumService;
import br.com.arthurschultz.bands.Service.SongService;
import br.com.arthurschultz.bands.model.Band;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class APIBandController {
    @Autowired
    private BandService bandService;
    @Autowired
    private AlbumService albumService;
    @Autowired
    private SongService songService;

    @GetMapping("/bands")
    public ResponseEntity<List<Band>> findAll() {
        return new ResponseEntity<>(
            bandService.findAll().stream().map(
                        (obj) -> obj).collect(Collectors.toList()),
                HttpStatus.OK);
    }
   
    @GetMapping("/bands/{band}")
    public ResponseEntity<List<Object>> findAllAlbuns(@PathVariable String band) {
        return new ResponseEntity<>(
            albumService.findAlbuns(band).stream().map(
                        obj -> obj).collect(Collectors.toList()),
                HttpStatus.OK);
    }

    @GetMapping("/bands/{band}/{album}")
    public ResponseEntity<List<Object>> findAllASongs(@PathVariable String band, @PathVariable String album) {
        return new ResponseEntity<>(
            songService.findSongs(band, album).stream().map(
                        (obj) -> obj).collect(Collectors.toList()),
                HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<String> postReq() {
        return new ResponseEntity<>("Error 400 - Bad Request", HttpStatus.BAD_REQUEST);
    }
    
    @PutMapping
    public ResponseEntity<String> putReq() {
        return new ResponseEntity<>("Error 400 - Bad Request", HttpStatus.BAD_REQUEST);
    }
    
    @DeleteMapping
    public ResponseEntity<String> deleteReq() {
        return new ResponseEntity<>("Error 400 - Bad Request", HttpStatus.BAD_REQUEST);
    }

}
