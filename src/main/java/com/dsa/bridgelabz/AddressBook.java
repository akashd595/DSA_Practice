package com.dsa.bridgelabz;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contact;

    public AddressBook(ArrayList<Contact> contact) {
        this.contact = contact;
    }

    public ArrayList<Contact> getContact() {
        return contact;
    }

    public void setContact(ArrayList<Contact> contact) {
        this.contact = contact;
    }

    public AddressBook() {
    }

    @Override
    public String toString() {
        return "\nAddressBook{" +
                "\ncontact= " + contact +
                "}\n";
    }
}
