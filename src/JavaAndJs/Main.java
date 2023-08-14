package JavaAndJs;
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Omurbek",23,"Java");
        Student student1 = new Student("Hadidga",32,"Java");
        Student student2 = new Student("Ainazik",22,"Js");
        Student student3 = new Student("Nuriza",18,"Java");
        Student student4 = new Student("Jandar",19,"Js");
        Student [ ] students = {student,student1,student2,student3,student4};

        int i = 0;
        int j = 0;
        for (Student s:students) {
            if(s.getGroup().equals("Java")){
                i++;
            }
        }
        for (Student s:students) {
            if (s.getGroup().equals("Js")){
                j++;
            }
        }
        int sum=0;

        int o = 0;
        for (Student s:students) {
            sum += s.getAge();
            o++;
        }
        double resaul = (double) sum /o;

        System.out.println("v gruppe Java : "+i+" studentov");
        System.out.println("v gruppe Js : "+j+" studentov");
        System.out.println("srednee arif chislo vosrostov :"+resaul);






    }

}
