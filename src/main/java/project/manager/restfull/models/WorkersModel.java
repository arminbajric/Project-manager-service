package project.manager.restfull.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "workers")
public class WorkersModel implements Serializable {
    @GenericGenerator(name = "workersGenerator",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",parameters ={
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "workerSequence"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    } )
    @Id
    @GeneratedValue(generator = "workersGenerator")
    Long Id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;
    @Column(name = "street")
    String street;
    @Column(name = "city")
    String city;
    @Column(name = "came")
    Date came;
    @Column(name = "gone")
    Date gone;
    @Column(name = "email")
    String email;
    @Column(name = "pass" )
    String password;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "worker_role",
            joinColumns = { @JoinColumn(name = "worker_id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id") }
    )
    Set<RolesModel> rolesModelSet = new TreeSet<>();
    @ManyToMany(mappedBy = "workersModels")
    private Set<ProjectsModel> projectsModels = new TreeSet<>();



}
