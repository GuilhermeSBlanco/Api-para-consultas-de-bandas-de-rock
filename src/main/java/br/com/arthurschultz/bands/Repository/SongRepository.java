package br.com.arthurschultz.bands.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.arthurschultz.bands.model.Songs;

@Repository
public interface SongRepository extends JpaRepository<Songs, Integer> {
    
}