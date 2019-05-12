package project.manager.restfull.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name="roles")
public class RolesModel implements Serializable {
    @GenericGenerator(name = "rolesGenerator",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",parameters =  {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "rolesSequence"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    })
    @Id
    @GeneratedValue(generator = "rolesIdGenerator")
    Long Id;
    @Column(name = "title")
    String title;
    @Column(name = "description")
    String description;
    @ManyToOne
    @JoinColumn(name = "skills")
    private SkillsModel skillsModel;
    @ManyToMany(mappedBy = "rolesModelSet")
    private Set<WorkersModel> workersModels = new TreeSet<>();


}
