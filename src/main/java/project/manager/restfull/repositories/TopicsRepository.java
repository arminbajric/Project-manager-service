package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.TopicsModel;

@Repository
public interface TopicsRepository extends JpaRepository<TopicsModel,Long> {
}
