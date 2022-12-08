package ee.service2school.domain.offer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer, Integer> {

    List<Offer> findTop5ByOrderByDateAddDescNameAsc();
    List<Offer> findTop100ByOrderByDateAddDescNameAsc();

}