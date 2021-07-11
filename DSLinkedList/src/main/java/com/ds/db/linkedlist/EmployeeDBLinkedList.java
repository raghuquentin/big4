package com.ds.db.linkedlist;

import com.ds.linkedlist.model.Employee;

public class EmployeeDBLinkedList {
    EmployeeDBNode head;
    EmployeeDBNode tail;
    Employee employee;

    public void addToFront(Employee employee){
        EmployeeDBNode node = new EmployeeDBNode(employee);
        node.setNext(head);
        if(head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
        }
        head=node;
    }

    public void addToEnd(Employee emp){
        EmployeeDBNode node = new EmployeeDBNode(emp);
        if(tail == null){
            head = node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
    }
    public void traverseFromHead(){
        EmployeeDBNode headNode = head;
        while (headNode!=null){
            System.out.println("From Head => "+headNode.getEmployee().getEmpId());
            headNode=headNode.getNext();
        }
    }
    public void traverseFromEnd(){
        EmployeeDBNode tailNode = tail;
        while (tailNode!=null){
            System.out.println("From end => "+tailNode.getEmployee().getEmpId());
            tailNode=tailNode.getPrevious();
        }
    }
}
