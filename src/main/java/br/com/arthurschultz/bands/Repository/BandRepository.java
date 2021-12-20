package br.com.arthurschultz.bands.Repository;

import java.util.Optional;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import br.com.arthurschultz.bands.model.Band;

@Repository
public interface BandRepository extends JpaRepository<Band, Integer> {

}
