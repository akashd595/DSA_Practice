package com.dsa.bridgelabz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact();

        ArrayList<Contact> contactList = new ArrayList<>();
        boolean flag = true;
//        printContact(contact);



        while(flag){
            System.out.println("1.add contact ");
            System.out.println("0.No just exit ");
            String addContact = sc.next();

            if(addContact.equals("1")){
                System.out.println("Add");
                contact = createContact();
                contactList.add(contact);
                addressBook = addContactIntoAddressBook(contactList);
                System.out.println("AddressBook "+addressBook);
            }if(addContact.equals("0")){
                flag = false;

            }
        }

    }
    public static Contact createContact(){
        String fname, lname, email, state, address, city, zip, pNumber;
        System.out.println("Enter Contact details ");
        Contact contact = null;
        System.out.println("Enter first name ");
        fname = sc.next();
        System.out.println("Enter last name ");
        lname = sc.next();
        System.out.println("Enter email ");
        email = sc.next();
        System.out.println("Enter phone number ");
        pNumber = sc.next();
        System.out.println("Enter city ");
        city = sc.next();
        System.out.println("Enter state ");
        state = sc.next();
        System.out.println("Enter address ");
        address = sc.next();
        System.out.println("Enter zip ");
        zip = sc.next();

        contact = new Contact(fname, lname, email,pNumber, address,state,city,zip);
        return contact;
    }
    public static AddressBook addContactIntoAddressBook(ArrayList<Contact> contact){
        AddressBook addressBook = new AddressBook();

        addressBook.setContact(contact);
        return addressBook;
    }
    static void printContact(Contact contact){
        System.out.println("Details are "+contact.toString());
    }
}
