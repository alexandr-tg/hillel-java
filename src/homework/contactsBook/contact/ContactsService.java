package homework.contactsBook.contact;

public interface ContactsService {
    ContactsList getAll();
    void remove(int index);
    void add(Contact c);

    ContactsList getContactsByPartOfPhone(String part);
    ContactsList getContactsByBeginningOfName(String part);
}
