package br.com.arthurschultz.bands.Repository;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import br.com.arthurschultz.bands.model.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
    @Query("Select Name from Album where Name = :bandname")
    public Optional<Album> findByName(@Param("bandname") String name);

    @Query("Select Name from Album where Band = :name")
    public List<Object> findAlbuns(@Param("name") String name);
}
