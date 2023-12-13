package ra.academy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @Column(length = 5)
    private String id;
    @Column(length = 100)
    private String name;
    private Double price;
    @Column(columnDefinition = "text")
    private String image;
}
