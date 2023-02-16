package oops_concept.class_and_object_7_PM_Batch;

public class college1 {
    String Name ;
    String city;
    int student;
    int room;

    public college1(String name, String city, int student, int room) {
        Name = name;
        this.city = city;
        this.student = student;
        this.room = room;
    }

    public static void main(String args[]){

        college1 obj= new college1("rahul","Agra",40,50);
        System.out.println("my name is"+obj.Name+"i live is"+obj.city+"total class student is"
                +obj.student+"total room"+obj.room);
    }
}
