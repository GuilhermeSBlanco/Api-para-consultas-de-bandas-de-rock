package br.com.arthurschultz.bands.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.PathVariable;
import br.com.arthurschultz.bands.Service.BandService;
//import br.com.arthurschultz.bands.Service.AlbumService;
//import br.com.arthurschultz.bands.Service.SongService;
import br.com.arthurschultz.bands.model.Band;
//import br.com.arthurschultz.bands.model.Albuns;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/bands")
public class APIBandController {
    @Autowired
    private BandService bandService;
    //@Autowired
    //private AlbumService albumService;
   // @Autowired
    //private SongService songService;

    @GetMapping
    public ResponseEntity<List<Band>> findAll() {
        return new ResponseEntity<>(
            bandService.findAll().stream().map(
                        (obj) -> obj).collect(Collectors.toList()),
                HttpStatus.OK);
    }
    
    // @GetMapping("/albuns/{name}")
    // public ResponseEntity<Albuns> findByName(@PathVariable String name) {
    //     return new ResponseEntity<>(albumService.findByName(name), HttpStatus.OK);
    // }
}
