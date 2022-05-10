package ipeps.pwd.wallet.module.entity;
import javax.persistence.*;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity

public class Schedule<string, date> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private  string type;
    private  date date_schedule;
    private  string comment;

    @ManyToOne

    private Employee employee;


}
