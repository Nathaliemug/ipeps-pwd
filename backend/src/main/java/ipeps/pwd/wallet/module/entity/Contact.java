package ipeps.pwd.wallet.module.entity;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import  lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Contact<string> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private string firstName;
    private string lastName;
    private string email;
    private string phone;


}
