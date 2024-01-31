package com.studentDetails.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentEntity {

    private long studentId;
    private String first_name;
    private String last_name;
    private long mobile_number;
}
