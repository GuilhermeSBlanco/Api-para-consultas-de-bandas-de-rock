package br.com.arthurschultz.bands.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.arthurschultz.bands.model.Albuns;

@Repository
public interface AlbumRepository extends JpaRepository<Albuns, Integer> {
    public Optional<Albuns> findByNameContains(String name);
}