package homework.contactsBook.menu.actions;

import homework.contactsBook.contact.ContactsList;
import homework.contactsBook.contact.ContactsService;
import homework.contactsBook.menu.MenuAction;

import java.util.Scanner;

public class SearchByBeginningOfNameMenuAction implements MenuAction {
    Scanner sc;
    ContactsService cs;

    public SearchByBeginningOfNameMenuAction(Scanner sc, ContactsService cs){
        this.sc = sc;
        this.cs = cs;
    }

    @Override
    public void doAction() {
        System.out.println("Input beginning of name:");
        ContactsList contacts = cs.getContactsByBeginningOfName(sc.nextLine());
        for (int i = 0; i < contacts.getLen(); i++) {
            System.out.println("Name: " + contacts.get(i).getName() + " Phone: " + contacts.get(i).getPhone());
        }
    }

    @Override
    public String getName() {
        return "Search by beginning of name";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
