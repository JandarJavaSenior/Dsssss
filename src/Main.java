import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("Taalaibekov Jandar Taalaibekovich",
                707986784,"Temetey",100000);
        Student student1 = new Student("ibaovich ivan ivanov",
                707986784,"Temetey",65000);
        Student student2 = new Student("Maksim Makisimov ",
                707986784,"Temetey",25000);
        Student student3 = new Student("Vova vovanovich",
                707986784,"Manas",20000);
        Student student4 = new Student("Lybop Svetlanovna",
                707986784,"Manas",30000);
        Student student5 = new Student("krasavchik Krasavchikov",
                707986784,"Manas",10000);


        Aparumentee aparumentee = new Aparumentee("PetHose",20000,"qwerty");
        Aparumentee aparumentee1 = new Aparumentee("PetHostel",5000,"qwert");


        Student [] students = {student,student1,student2,student3,student4,student5};
        Aparumentee [ ] aparumentees = {aparumentee,aparumentee1};

        System.out.println("Введите адрес!: ");String odinakova = scanner.nextLine();

        boolean found = false;

        for (Student s : students) {
            if (s.getAddress().equals(odinakova)) {
                System.out.println(s.getFio());
                found = true;
            }
        }

        for (Aparumentee s : aparumentees) {
            if (s.getAddress().equals(odinakova)) {
                System.out.println(s.getTittle());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Ничего не найдено.");

        }
        System.out.println();
        for (Student studen : students) {
            System.out.println("Студент: " + studen.getFio());
            System.out.println("Банковский счет: " + studen.getBank() + " сом");

            int pitHostel = Aparumentee.skoko(studen.getBank(), aparumentee1.getPrise() );
            int pitHouse = Aparumentee.skoko(studen.getBank(), aparumentee.getPrise());
            System.out.println("проживания в Питхотеле: " + pitHostel + " месяцев");
            System.out.println("проживания в Питхаусе: " +pitHouse + " месяцев");
            System.out.println();
        }


    }




}


