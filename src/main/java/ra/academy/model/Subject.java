package ra.academy.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id
    @Column(length = 4, name = "subjectId")
    private String subjectId;

    @Column(length = 45, name = "subjectName")
    private String subjectName;

    @Column
    private Integer priority;

    @OneToMany(mappedBy = "subject", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Mark> markList;

}
