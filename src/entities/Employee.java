package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Nikola Dragić
 */
@Entity
@Table(name="employees")
public class Employee implements Serializable {
    @Id
    @Column(name="employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="address")
    private String address;
    @Column(name="salary")
    private long salary;
    
    public Employee(){
        
    }
    
    //Parametrized constructor with name only
    public Employee(String name){
        this.name = name;
    }
    
    //Parametrized constructor without id
    public Employee(String name, int age, String address, long salary){
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }
    
    //Parametrized constructor full
    public Employee(int id, String name, int age, String address, long salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    } 
    
    //Getter methods
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }
    public long getSalary(){
        return this.salary;
    }
    
    //Setter methods
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setSalary(long salary){
        this.salary=salary;
    }
    
    //Overridden toString method
    @Override
    public String toString(){
        return "Name: " + this.name + ", age: " +this.age + ", address: " + this.address + ", salary: "+this.salary;
    }
    
    
}
