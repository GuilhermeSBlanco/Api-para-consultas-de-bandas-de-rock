package br.com.arthurschultz.bands.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.arthurschultz.bands.Repository.SongRepository;
import br.com.arthurschultz.bands.model.Song;
import java.util.List;
import java.util.Optional;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepo;

    public Song insertOrUpdate(Song album) {
        return songRepo.save(album);
    }

    public List<Song> findAll() {
        return songRepo.findAll();
    }

    public Optional<Song> findById(int id) {
        return songRepo.findById(id);
    }

    public boolean Delete(int id) {
        var song = this.findById(id);

        if (song.isPresent()) {
            songRepo.deleteById(id);
        }
        
        song = this.findById(id);
        return song.isEmpty();
    }

    public List<Object> findSongs(String band, String album) {
        return songRepo.findSongs(band.replace('-', ' '), album.replace('-', ' '));
    }
}
