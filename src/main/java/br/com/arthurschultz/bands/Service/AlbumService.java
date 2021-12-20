package br.com.arthurschultz.bands.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.arthurschultz.bands.model.Album;
import br.com.arthurschultz.bands.Repository.AlbumRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepo;

    public Album insertOrUpdate(Album album) {
        return albumRepo.save(album);
    }

    public List<Album> findAll() {
        return albumRepo.findAll();
    }

    public Album findByName(String name) {
        var album = albumRepo.findByName(name.replace('-', ' '));
        if (album.isPresent()) {
            return album.get();
        }
        return new Album();
    }

    public List<Object> findAlbuns(String name) {
        return albumRepo.findAlbuns(name.replace('-', ' '));
    }

    public Optional<Album> findById(int id) {
        return albumRepo.findById(id);
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
