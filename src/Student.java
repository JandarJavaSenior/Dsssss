public class Student {
        private String name;
        private  int nomer;
        private int id;

    public Student(String name, int nomer, int id) {
        this.name = name;
        this.nomer = nomer;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nomer=" + nomer +
                ", id=" + id +
                '}';
    }
}
