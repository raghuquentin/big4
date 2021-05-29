package com.ds.linkedlist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String empName;
    private long empId;
    private int age;
    public Employee(long empId){
        this.empId = empId;
    }

}
