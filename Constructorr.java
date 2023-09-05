
class Employee {
    private int id;
    private String name;

    public Employee() { // it has no return type or value
        id = 1;
        name = "Y our-Name";
        System.out.println("I am from Employee ");
    }

    public Employee(int myId, String myName) {
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class Constructorr {
    public static void main(String[] args) {
        // Employee emp = new Employee(10, "cars");
        Employee emp = new Employee();
        // emp.setId(5);
        // emp.setName("shahzil");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
