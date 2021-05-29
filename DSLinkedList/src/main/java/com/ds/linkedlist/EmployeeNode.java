package com.ds.linkedlist;

import com.ds.linkedlist.model.Employee;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EmployeeNode {
    Employee employee;
    EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee=employee;
    }
}
