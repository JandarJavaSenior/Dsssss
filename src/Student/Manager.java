package Student;

import java.util.Arrays;

public class Manager {
    Student[] students;

    public Manager(Student[] students) {
        this.students = students;
    }

    public Manager() {
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public String add(Student student) {
        for (Student b : students) {
            if (b.getName().equals(student.getName())) {


            }
        }
        Student[] arr = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            arr[i] = students[i];
        }

        arr[students.length] = student;
        students = Arrays.copyOf(arr, arr.length);


        return "added";
    }



    public Student findStudentById(int id) {
        for (Student stu : students) {
            if (stu.getId() == id) {
                return stu;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student.Student.Manager{" +
                "students=" + Arrays.toString(students) +
                '\n';
    }

    public Student updeit (String name, Student student){
        for (int i = 0; i <students.length ; i++) {
            if (students[i].getName().equalsIgnoreCase(name))
                students[i]= student;

        }
        return student;
    }
    public void remuv (String name){
        int index = 999;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equalsIgnoreCase(name)){
                index = i;
                break;


            }

        }
        if(index != 999){
            Student[] newStu = new Student[students.length-1];
            int j = 0;
            for (int i = 0; i < students.length; i++) {
                if(i !=index){
                    newStu[j] = students[i];
                    j++;

                }

            }
            students = newStu;

        }


    }
}
