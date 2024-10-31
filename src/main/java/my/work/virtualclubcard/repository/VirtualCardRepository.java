package my.work.virtualclubcard.repository;

import my.work.virtualclubcard.model.VirtualCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VirtualCardRepository extends CrudRepository<VirtualCard,Long> {

}
