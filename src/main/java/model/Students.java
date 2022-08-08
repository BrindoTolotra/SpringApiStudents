package model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Students{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_student;

    @Column(nullable = false)
    private String name;
}