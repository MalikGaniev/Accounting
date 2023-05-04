package com.smart.accounting;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Data
public class Category extends BaseEntity {

    String categoryName;
    Double tax;

}
