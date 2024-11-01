package my.work.virtualclubcard.repository;

import my.work.virtualclubcard.model.ClubMembers;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<ClubMembers,Long> {

}
