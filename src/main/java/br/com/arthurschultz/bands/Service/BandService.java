package br.com.arthurschultz.bands.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.arthurschultz.bands.Repository.BandRepository;
import br.com.arthurschultz.bands.model.Band;
import java.util.List;
import java.util.Optional;

@Service
public class BandService {
    @Autowired
    private BandRepository BandRepo;

    public Band insertOrUpdate(Band band) {
        return BandRepo.save(band);
    }

    public List<Band> findAll() {
        return BandRepo.findAll();
    }

    public Optional<Band> findById(int id) {
        return BandRepo.findById(id);
    }

    public boolean Delete(int id) {
        var band = this.findById(id);

        if (band.isPresent()) {
            BandRepo.deleteById(id);
            band = findById(id);
        }
        
        band = this.findById(id);
        return band.isEmpty();
    }
}
