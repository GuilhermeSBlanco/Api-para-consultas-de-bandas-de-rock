package br.com.arthurschultz.bands.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import br.com.arthurschultz.bands.model.Song;
import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
    @Query("Select Name from Song where Band = :band and Album = :album")
    public List<Object> findSongs(@Param("band") String band, @Param("album") String album);
}