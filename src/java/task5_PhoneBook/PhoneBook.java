package task5_PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Julik on 24.04.2015.
 */
public class PhoneBook {
    public static void main(String[] args) {
        List persons = new ArrayList();
        for (;;) {
            System.out.println("Write 1 to Add Person, 2 to list, 0 to exit");
            Scanner in = new Scanner(System.in);
            String choice = in.next();
            if (choice.equals("1")) {
                Person a = Person.readPerson();
                persons.add(a);
            } else if (choice.equals("2")){
                for (int i = 0; i<persons.size(); ++i) {
                    System.out.println(persons.get(i));
                }
            }
            else if (choice.equals("0")) {
                System.out.println("Exiting..");
                break;
            } else System.out.println("I didn't catch that");
        }

    }

    public static class Person {
        private String name;
        private String phone;
        private String address;
        private String email;

        public Person(String name, String phone, String address, String email) {
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getAddress() {
            return address;
        }

        public String getEmail() {
            return email;
        }

        public static Person readPerson() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter name of a person");
            String name = in.nextLine();
            System.out.println("Enter phone of a person");
            String phone = in.nextLine();
            System.out.println("Enter address");
            String address = in.nextLine();
            System.out.println("Enter email");
            String email = in.nextLine();
            Person person = new Person(name, phone, address, email);
            return person;
        }

        public String toString() {
            return ("Name: " + name + ", Phone: " + phone + ", Address: " + address + ", Email: " + email);
        }

    }

}

//phonebook add
//phone book search
// phone book hold