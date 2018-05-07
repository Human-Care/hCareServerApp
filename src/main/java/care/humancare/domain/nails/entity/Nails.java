package care.humancare.domain.nails.entity;

import care.humancare.domain.account.entity.Account;
import com.vividsolutions.jts.geom.Geometry;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Nails {

    @Id
    @Column(name="nails_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToMany(mappedBy="nails")
    private Set<Account> accounts = new HashSet<>();

    @Column
    private Integer free;

    @Column
    private Integer price;

    @Column(name = "location", columnDefinition="Geometry")
    private Geometry location;
}
