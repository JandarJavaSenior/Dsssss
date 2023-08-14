package Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Jandar",707986784,1234);
        Student student1 = new Student("Janda",7986784,123);
        Student student2 = new Student("Jand",77986784,12);
        Student student3 = new Student("Jan",7086784,34);
        Student student4 = new Student("Ja",707784,14);
        Student[] students = {student,student1,student2,student3};
        Manager mana = new Manager(students);


        System.out.println("------------------------------");
        System.out.println("poisk po id");

        System.out.println(mana.findStudentById(34));
        System.out.println("------------------------------");
        System.out.println("dobavlenie 4 studenta");

        mana.add(student4);

        System.out.println(Arrays.toString(mana.getStudents()));

        System.out.println("------------------------------");
        System.out.println("obnavlenie 1 studenta");
        mana.updeit("Jandar",student1);
        System.out.println(Arrays.toString(mana.getStudents()));
        System.out.println("------------------------------");
        System.out.println("udalenie studenta po imeni");

        mana.remuv("Jand");
        System.out.println(Arrays.toString(mana.getStudents()));




    }
}