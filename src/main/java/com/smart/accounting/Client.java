package com.smart.accounting;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Getter
@Setter
@Entity
@Table(name = "client")
public class Client extends BaseEntity {

    private String clientName;
    private String email;
    private String phone;
//    @OneToMany
//    private Set<Address> address;
}
