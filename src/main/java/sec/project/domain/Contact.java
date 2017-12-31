package sec.project.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "Contact")
public class Contact extends AbstractPersistable<Long> {



    private String name;
    private String number;
    @ManyToOne
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Contact(){}

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
        this.account = null;
    }

    public Contact(String name, String number, Account account) {
        this.name = name;
        this.number = number;
        this.account = account;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
