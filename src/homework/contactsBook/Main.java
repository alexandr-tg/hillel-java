package homework.contactsBook;

import homework.contactsBook.contact.ContactsList;
import homework.contactsBook.contact.ContactsService;
import homework.contactsBook.contact.InMemoryContactsService;
import homework.contactsBook.menu.Menu;
import homework.contactsBook.menu.actions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(sc);

        ContactsService cs = new InMemoryContactsService(new ContactsList());

        menu.addAction(new AddContactMenuAction(sc, cs));
        menu.addAction(new ReadAllContactsMenuAction(sc, cs));
        menu.addAction(new RemoveContactMenuAction(sc, cs));
        menu.addAction(new SearchByPartOfPhoneMenuAction(sc, cs));
        menu.addAction(new SearchByBeginningOfNameMenuAction(sc, cs));
        menu.addAction(new ExitContactMenuAction());

        menu.run();
    }
}