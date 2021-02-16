package homework.contactsBook.menu.actions;

import homework.contactsBook.contact.ContactsList;
import homework.contactsBook.contact.ContactsService;
import homework.contactsBook.menu.MenuAction;

import java.util.Scanner;

public class SearchByPartOfPhoneMenuAction implements MenuAction {
    Scanner sc;
    ContactsService cs;

    public SearchByPartOfPhoneMenuAction(Scanner sc, ContactsService cs){
        this.sc = sc;
        this.cs = cs;
    }

    @Override
    public void doAction() {
        System.out.println("Input part of phone number:");
        ContactsList contacts = cs.getContactsByPartOfPhone(sc.nextLine());
        for(int i = 0; i < contacts.getLen(); i++){
            System.out.println("Name: " + contacts.get(i).getName() + " Phone: " + contacts.get(i).getPhone());
        }
    }

    @Override
    public String getName() {
        return "Search by part of phone number";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
