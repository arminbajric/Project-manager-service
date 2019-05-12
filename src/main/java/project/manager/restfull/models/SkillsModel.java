package project.manager.restfull.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "skills")
public class SkillsModel implements Serializable {
    @GenericGenerator(name = "skillsGenerator",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",parameters =  {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "skillsSequence"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    })
    @Id
    @GeneratedValue(generator = "skillsIdGenerator")
    Long Id;
    @Column(name = "title")
    String title;
    @OneToMany(mappedBy = "skillsModel")
    private Set<RolesModel> rolesModel;
}
