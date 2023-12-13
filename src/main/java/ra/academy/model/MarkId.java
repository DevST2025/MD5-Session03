package ra.academy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MarkId implements Serializable {
    @Column(name = "studentId")
    private String studentId;

    @Column(name = "subjectId")
    private String subjectId;

}
