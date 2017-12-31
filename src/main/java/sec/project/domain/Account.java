package sec.project.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Account extends AbstractPersistable<Long> {


    private String username;
    private String pass;

    public Account() {
        super();
    }

    public Account(String name, String pass) {
        this();
        this.username = name;
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

}
