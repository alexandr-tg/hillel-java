package homework.contactsBook.menu.actions;

import homework.contactsBook.contact.ContactsService;
import homework.contactsBook.contact.ContactsList;
import homework.contactsBook.menu.MenuAction;

import java.util.Scanner;

public class ReadAllContactsMenuAction implements MenuAction {
    Scanner sc;
    ContactsService cs;

    public ReadAllContactsMenuAction(Scanner sc, ContactsService cs){
        this.sc = sc;
        this.cs = cs;
    }

    @Override
    public void doAction() {
        ContactsList cl = cs.getAll();
        System.out.println("----------------------");
        for (int i = 0; i < cl.getLen(); i++) {
            System.out.print((i+1) + " Name: " + cl.get(i).getName() + " ");
            System.out.println("Phone Number: " + cl.get(i).getPhone());
        }
        System.out.println("----------------------");
    }

    @Override
    public String getName() {
        return "Read Contacts list";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
