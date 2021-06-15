package com.ds.db.linkedlist;

import com.ds.linkedlist.model.Employee;

public class DBMain {
    public static void main(String[] args) {
        EmployeeDBLinkedList list = new EmployeeDBLinkedList();
        list.addToFront(new Employee(1000));
        list.addToFront(new Employee(2000));
        list.addToFront(new Employee(3000));
        list.addToEnd(new Employee(10009,"addToEnd"));
        list.traverseFromHead();
        list.traverseFromEnd();
    }
}
