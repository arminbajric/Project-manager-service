package project.manager.restfull.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "topics")
public class TopicsModel implements Serializable {
    @GenericGenerator(name = "topicsIdGenerator",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",parameters =  {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "topicsSequence"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    })
    @javax.persistence.Id
    @GeneratedValue(generator = "topicsIdGenerator")
    Long Id;
    @ManyToMany(mappedBy = "topicsModels")
    private Set<MeetingModel> meetingModels = new TreeSet<>();
}
