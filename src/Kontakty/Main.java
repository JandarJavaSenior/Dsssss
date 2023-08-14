package Kontakty;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("AkeBaike",129809);
        Contact contact1 = new Contact("Ake",125436);
        Contact contact2 = new Contact("Baike",129346);
        Contact contact3 = new Contact("AkeBaikeAva",126769);
        Contact contact4 = new Contact("Ava",1349809);
        Contact [] contacts = {contact,contact1,contact2,contact3,contact4};
        Contact [] contacts1 = {contact,contact1,contact2};

        Phone phone = new Phone("Mi","Redmi pro 12 ultra",15000,"Koshna",contacts);
        Phone phon = new Phone("Iphone","Iphone Max pro 12",90000,"Tuugan",contacts1);



        phone.getContactCount();
        System.out.println(Arrays.toString(contacts));
        phon.getContactCount();
        System.out.println(Arrays.toString(contacts1));


    }
}
