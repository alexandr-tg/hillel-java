package homework.contactsBook.menu.actions;

import homework.contactsBook.contact.ContactsService;
import homework.contactsBook.menu.MenuAction;

import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction {
    Scanner sc;
    ContactsService cs;

    public RemoveContactMenuAction(Scanner sc, ContactsService cs){
        this.sc = sc;
        this.cs = cs;
    }

    @Override
    public void doAction() {
        System.out.println("Input Number of contact:");
        cs.remove(sc.nextInt()-1);
    }

    @Override
    public String getName() {
        return "Remove Contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
