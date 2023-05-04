package com.smart.accounting;

import lombok.Data;
import lombok.Getter;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String email;
    private String firstname;
    private String lastname;
    private String password;

//    @ManyToOne
//    private State state;

}
