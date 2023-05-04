package com.smart.accounting;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table (name = "category")
@NoArgsConstructor
@Data
@Table(name = "category")
public class Category extends BaseEntity{

    String categoryName;
    Double tax;


}
