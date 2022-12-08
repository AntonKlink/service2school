package ee.service2school.domain.offer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer, Integer> {

    List<Offer> findTop5ByStatusOrderByDateAddDesc(String status);


    List<Offer> findTop100ByOrderByDateAddDescNameAsc();

    @Query("select o from Offer o where o.user.id = ?1 and o.status = ?2 order by o.dateAdd DESC")
    List<Offer> findOffersByStatusAndUserId(Integer userId, String status);

//    long deleteByName(String name);

}