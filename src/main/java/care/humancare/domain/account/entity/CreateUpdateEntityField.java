package care.humancare.domain.account.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Calendar;

@MappedSuperclass
public class CreateUpdateEntityField {

    @Column(updatable = false)
    @CreationTimestamp
    private Calendar createDate;

    @UpdateTimestamp
    private Calendar updateDate;

}
