package br.com.arthurschultz.bands.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.arthurschultz.bands.model.Band;

@Repository
public interface BandRepository extends JpaRepository<Band, Integer> {
    
}
