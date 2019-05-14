package project.manager.restfull.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "meetings")
public class MeetingModel implements Serializable {
    @GenericGenerator(name = "meetingsIdGenerator",strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",parameters =  {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "meetingsSequence"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    })
    @javax.persistence.Id
    @GeneratedValue(generator = "meetingsIdGenerator")
    Long Id;
    @Column(name = "title")
    String title;
    @Column(name="dateOfmeeting")
    Date date;
    @Column(name="office")
    String office;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "meeting_topic",
            joinColumns = { @JoinColumn(name = "meeting_id") },
            inverseJoinColumns = { @JoinColumn(name = "topics_id") }
    )
    Set<TopicsModel> topicsModels = new TreeSet<>();


}
