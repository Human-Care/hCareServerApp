package care.humancare.domain.account.entity;

import javax.persistence.*;

@Entity
public class Account extends CreateUpdateEntityField {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    public Account() {}

    public Account(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Account{id=%d, name='%s', surname='%s'}", id, name, surname);
    }
}
