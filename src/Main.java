
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Jandar",707986784,1234);
        Student student1 = new Student("Janda",7986784,123);
        Student student2 = new Student("Jand",77986784,12);
        Student student3 = new Student("Jan",7086784,34);
        Student student4 = new Student("Ja",707784,14);
        Student[] students = {student,student1,student2,student3,student4};
        Manager mana = new Manager(students);
        System.out.println(mana.findStudentByName("Jandar"));
        System.out.println(mana.findStudentById(444));

    }
}