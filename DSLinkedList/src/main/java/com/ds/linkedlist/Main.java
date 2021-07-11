package com.ds.linkedlist;
/**
 * Linked list -> Linked by nodes
 * Node -> node contains data and reference to the next node
 * In adding front and removing front, time complexity is O(1)
 * In the middle, need to traverse the list
 *
 * EmployeeLinkedList -> LinkedList
 * EmployeeNode       -> Node
 * Employee           -> data
 */
import com.ds.linkedlist.model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(new Employee(1));
        list.addToFront(new Employee(2));
        list.addToFront(new Employee(3));

        list.printList();
    }
}
