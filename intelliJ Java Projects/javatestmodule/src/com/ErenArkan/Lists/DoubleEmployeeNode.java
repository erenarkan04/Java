package com.ErenArkan.Lists;

public class DoubleEmployeeNode {

    private Employee employee;
    private DoubleEmployeeNode prev;
    private DoubleEmployeeNode next;

    public DoubleEmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public DoubleEmployeeNode getNext() {
        return next;
    }

    public void setNext(DoubleEmployeeNode next) {
        this.next = next;
    }

    public String toString () {
        return employee.toString();
    }

    public DoubleEmployeeNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleEmployeeNode prev) {
        this.prev = prev;
    }
}
