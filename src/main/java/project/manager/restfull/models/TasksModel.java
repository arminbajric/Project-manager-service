package project.manager.restfull.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Data
@Entity
@Table(name="tasks")
public class TasksModel implements Serializable {
    @GenericGenerator(name="tasksGenerator",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",parameters ={
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "tasksSequence"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    } )
    @Id
    @GeneratedValue(generator = "tasksGenerator")
    Long Id;
    @Column(name="title")
    String title;
    //here goes FK to projects
    @Column(name = "summary")
    String summary;
    @Column(name = "notes")
    String notes;

    @Column(name = "deadline")
    Date deadline;
    //here goes project workersFK
    @OneToMany(mappedBy = "tasksModel")
    private Set<ActionsModel> actionsModels=new TreeSet<>();
    @OneToMany(mappedBy = "tasksModel")
    private Set<DocumentationModel> documentationModels=new TreeSet<>();
}
