package project.manager.restfull.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="documentation")
public class DocumentationModel implements Serializable {
    @GenericGenerator(name = "docGenerator",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",parameters =  {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "docSequence"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    })
    @javax.persistence.Id
    @GeneratedValue(generator = "docGenerator")
    Long Id;
    @Column(name = "title")
    String title;
    @Column(name="data")
    byte[] fileData;
    @ManyToOne
    @JoinColumn(name = "task")
    private TasksModel tasksModel;
    @ManyToOne
    @JoinColumn(name = "actionsModel")
    private ActionsModel actionsModel;
}
