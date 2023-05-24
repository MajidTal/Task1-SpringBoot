package com.codeline.Task1.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
@Data
public class BaseEntity {

    Date createdDate;
    Date updatedDate;

}
