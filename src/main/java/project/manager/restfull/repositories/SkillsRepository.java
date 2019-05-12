package project.manager.restfull.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.manager.restfull.models.SkillsModel;

@Repository
public interface SkillsRepository extends JpaRepository<SkillsModel,Long> {
}
