package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.MeetingModel;

@Repository
public interface MeetingRepository extends JpaRepository<MeetingModel,Long> {
}
