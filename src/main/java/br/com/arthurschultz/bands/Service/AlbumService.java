package br.com.arthurschultz.bands.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.arthurschultz.bands.model.Albuns;
import br.com.arthurschultz.bands.Repository.AlbumRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepo;

    public Albuns insertOrUpdate(Albuns album) {
        return albumRepo.save(album);
    }

    public List<Albuns> findAll() {
        return albumRepo.findAll();
    }

    public Optional<Albuns> findById(int id) {
        return albumRepo.findById(id);
    }

    public Albuns findByName(String name) {
        var album = albumRepo.findByNameContains(name);
        if (album.isPresent()) {
            return album.get();
        }
        return new Albuns();
    }

    public boolean Delete(int id) {
        var album = this.findById(id);

        if (album.isPresent()) {
            albumRepo.deleteById(id);
        }
        
        album = this.findById(id);
        return album.isEmpty();
    }
}
