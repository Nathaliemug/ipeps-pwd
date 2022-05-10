package ipeps.pwd.wallet.module.entity;

import javax.persistence.*;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address<string> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private string type;
    private string road;
    private string number;
    private string box;
    private string cp;
    private string town;
    private string country;

    @ManyToOne

    private  Employee employee;


    @ManyToOne

    private Contact contact;

}
