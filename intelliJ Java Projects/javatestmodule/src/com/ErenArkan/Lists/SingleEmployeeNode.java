package com.ErenArkan.Lists;

public class SingleEmployeeNode {

    private Employee employee;
    private SingleEmployeeNode next;

    public SingleEmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public SingleEmployeeNode getNext() {
        return next;
    }

    public void setNext(SingleEmployeeNode next) {
        this.next = next;
    }

    public String toString () {
        return employee.toString();
    }
}
