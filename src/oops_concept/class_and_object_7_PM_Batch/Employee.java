package oops_concept.class_and_object_7_PM_Batch;

public class Employee {

    int Id;
    String emlName;
    String empDep;
    String empCity;


    public Employee(int id, String emlName, String empDep, String empcity) {
        Id = id;
        this.emlName = emlName;
        this.empDep = empDep;
        this.empCity = empcity;
    }

    public static void main(String[] args) {

        Employee obj1 = new Employee(123,"Rahul verma","civil engineer","Puna");

        System.out.println("my employee ID is= "+obj1.Id+"\nmy name is= "+obj1.emlName+"\nmy department is= "+obj1.empDep
        +"\nand i am living in= "+obj1.empCity);
    }
}
