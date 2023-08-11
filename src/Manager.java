public class Manager {
    Student [] students;

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
    public Student findStudentByName(String name) {
        for (Student stu : students) {
            if (stu.getName().equals(name)) {
                return stu;
            }
        }
        return null;
    }
    public Student findStudentById(int id) {
        for (Student stu : students) {
            if (stu.getId() == id) {
                return stu;
            }
        }
        return null;
    }

}
