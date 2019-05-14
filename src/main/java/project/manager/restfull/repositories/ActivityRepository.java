package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.ActivityModel;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityModel,Long> {
}
