
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author CPere
 */
public class Startup {
    
    public static void main(String[] args) {
      
        //----Lab#2---------
        List employeeList = new ArrayList();
       
        employeeList.add(new Employee("Perera", "Chathuri", "123-77-8888"));
        employeeList.add(new Employee("Johns", "Sam", "123-66-9999"));
        employeeList.add(new Employee("Davis", "Sareena", "143-67-9809"));
        
        for(int i=0; i < employeeList.size(); i++) {
            Employee emp = (Employee)employeeList.get(i);
            System.out.println(emp);
        }
        
        System.out.println("--------------------------------------");
        //----Lab#3---------
        List<Employee> newEmployeeList = new ArrayList<Employee>();
        
        newEmployeeList.add(new Employee("Perera", "Chathuri", "123-77-8888"));
        newEmployeeList.add(new Employee("Johns", "Sam", "123-66-9999"));
        newEmployeeList.add(new Employee("Davis", "Sareena", "143-67-9809"));
        
        
        Employee newEmp = null;
         for(int i = 0; i < newEmployeeList.size(); i++) {
            newEmp = newEmployeeList.get(i);
            System.out.println(newEmp);
        }
        
        
         System.out.println("--------------------------------------");
        //----Lab#4---------
        
         List<Dog> dogList = new ArrayList<Dog>();
         dogList.add(new Dog("Timmy", 2));
         dogList.add(new Dog("Kaly", 4));
         dogList.add(new Dog("Ranger", 2));
         dogList.add(new Dog("Snoopy", 5));
        
         
         Set<Dog> noDupes = new HashSet<Dog>(dogList);
        dogList = new ArrayList(noDupes);
        
         Dog dog = null;
         for(int i = 0; i < newEmployeeList.size(); i++) {
            dog = dogList.get(i);
            System.out.println(dog);
        }
        
    }
            
    
}
