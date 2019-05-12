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
@Table(name="actions")
public class ActionsModel implements Serializable {
    @GenericGenerator(name = "actionsIdGenerator",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",parameters =  {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "usersSequence"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    })
    @Id
    @GeneratedValue(generator = "actionsIdGenerator")
    Long Id;
    @Column(name = "title")
    String title;
    @Column(name = "notes")
    String notes;
    @Column(name = "date")
    Date deadline;
    @ManyToOne
    @JoinColumn(name = "task")
    private TasksModel tasksModel;
    @OneToMany(mappedBy = "actionsModel")
    private Set<DocumentationModel> documentationModels=new TreeSet<>();

}
