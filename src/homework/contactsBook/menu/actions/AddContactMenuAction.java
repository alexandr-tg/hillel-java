package homework.contactsBook.menu.actions;

import homework.contactsBook.contact.Contact;
import homework.contactsBook.contact.ContactsService;
import homework.contactsBook.menu.MenuAction;

import java.util.Scanner;

public class AddContactMenuAction implements MenuAction {
    Scanner sc;
    ContactsService cs;

    public AddContactMenuAction(Scanner sc, ContactsService cs){
        this.sc = sc;
        this.cs = cs;
    }

    @Override
    public void doAction() {
        System.out.println("input contacts name:");
        String name = sc.next();
        System.out.println("Input contacts number:");
        String number = sc.next();
        cs.add(new Contact(name, number));
    }

    @Override
    public String getName() {
        return "Add Contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
