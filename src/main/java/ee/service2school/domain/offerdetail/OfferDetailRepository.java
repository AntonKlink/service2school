package ee.service2school.domain.offerdetail;

import ee.service2school.domain.offer.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferDetailRepository extends JpaRepository<Offer, Integer> {
}