package com.nickperov.stud.java_samples.basic;
import java.util.*; 
 
class Employee { 
    private String name; 
 
    public Employee(String name){ 
        this.name = name; 
    } 
 
    public String toString(){ 
        return name; 
    } 
 
    public boolean equals(Object obj){ 
        HashCodeTest.count++; 
 
        if (obj == null) { 
            return false; 
        } 
        if (obj.getClass() != getClass()){ 
            return false; 
        } 
 
        Employee emp = (Employee)obj; 
        if (this.name == emp.name){ 
            return true; 
        } 
        return false; 
    } 
 
    public int hashCode(){ 
        return name.hashCode(); 
    } 
} 
 
public class HashCodeTest { 
    static int count = 0; 
 
    public static void main(String[] args) { 
 
        Map employees = new HashMap(); 
 
        employees.put(new Employee("Joe"), new Integer("1")); 
        employees.put(new Employee("Chandler"), new Integer("2")); 
        employees.put(new Employee("Chandler"), new Integer("2")); 
        employees.put(new Employee("Ross"), new Integer("3")); 
         
        Iterator iterator = employees.keySet().iterator(); 
 
        while (iterator. hasNext()) { 
            System.out.println(iterator.next()); 
        } 
 
        System.out.println(count); 
    } 
} 