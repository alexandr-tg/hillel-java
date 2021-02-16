package homework.contactsBook.contact;

public class InMemoryContactsService implements ContactsService{
    private ContactsList contactsList;

    public InMemoryContactsService(ContactsList c){
        this.contactsList = c;
    }

    @Override
    public ContactsList getAll() {
        return this.contactsList;
    }

    @Override
    public void remove(int index) {
        contactsList.remove(index);
    }

    @Override
    public void add(Contact c) {
        contactsList.add(c);
    }

    @Override
    public ContactsList getContactsByPartOfPhone(String part){
            ContactsList result = new ContactsList();
            for (int i = 0; i < this.contactsList.getLen(); i++) {
                if (!contactsList.get(i).getPhone().contains(part)) continue;
                result.add(contactsList.get(i));
            }
            return result;
    }

    @Override
    public ContactsList getContactsByBeginningOfName(String part) {
        ContactsList result = new ContactsList();
        for(int i = 0; i < contactsList.getLen(); i++){
            if(!contactsList.get(i).getName().toUpperCase().startsWith(part.toUpperCase())) continue;
            result.add(contactsList.get(i));
        }
        return result;
    }
}
