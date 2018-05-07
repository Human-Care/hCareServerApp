package care.humancare.domain.account.entity;

import care.humancare.domain.nails.entity.Nails;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Account extends CreateUpdateEntityField {

    @Id
    @Column(name="account_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "account_nails",
            joinColumns = { @JoinColumn(name = "account_Id")},
            inverseJoinColumns = { @JoinColumn(name = "nails_id")})
    private List<Nails> nails = new ArrayList<>();
}
