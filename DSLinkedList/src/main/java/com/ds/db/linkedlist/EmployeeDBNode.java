package com.ds.db.linkedlist;

import com.ds.linkedlist.model.Employee;
import lombok.Data;

public class EmployeeDBNode {
    Employee employee;
    EmployeeDBNode next;
    EmployeeDBNode previous;

    public EmployeeDBNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDBNode getNext() {
        return next;
    }

    public void setNext(EmployeeDBNode next) {
        this.next = next;
    }

    public EmployeeDBNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDBNode previous) {
        this.previous = previous;
    }
}
