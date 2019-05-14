package project.manager.restfull.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "projects")
public class ProjectsModel implements Serializable {
    @GenericGenerator(name = "projectsGenerator",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",parameters =  {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "projectsSequence"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    })
    @javax.persistence.Id
    @GeneratedValue(generator = "projectsGenerator")
    Long Id;
    @Column(name="title")
    String title;
    @Column(name = "summary")
    String summary;
    @Column(name = "notes")
    String notes;
    @Column(name="deadline")
    Date deadline;
    @Column(name="created")
    Date created;
    @OneToMany(mappedBy = "projectsModel")
    private Set<TasksModel> tasksModels=new TreeSet<>();
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "project_worker",
            joinColumns = { @JoinColumn(name = "project_id") },
            inverseJoinColumns = { @JoinColumn(name = "worker_id") }
    )
    Set<WorkersModel> workersModels = new TreeSet<>();
    @OneToMany(mappedBy = "projectsModel")
    private Set<DocumentationModel> documentationModels=new TreeSet<>();
}
