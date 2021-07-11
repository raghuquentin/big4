package com.ds.linkedlist;
/**
 *  head -> main node
 *  While creating new employeeNode, the next(node reference) as null (lno:14)
 *  and after created the employeenode, set next by using head and assign current
 *  node as head.
 */

import com.ds.linkedlist.model.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head= node;
    }

    public void printList(){
        EmployeeNode printNode = head;
        while(printNode!=null){
            System.out.println(printNode.employee);
            printNode=printNode.getNext();
        }
    }
}
