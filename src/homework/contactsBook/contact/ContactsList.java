package homework.contactsBook.contact;

import java.util.Arrays;

public class ContactsList {
    private Contact[] contacts = new Contact[4];
    private int len = 0;

    public Contact get(int index){
        checkExistIndex(index);
        return contacts[index];
    }

    public void set(int index, Contact c){
        checkExistIndex(index);
        contacts[index] = c;
    }

    public int size(){
        return contacts.length;
    }

    public void remove(int index) {
        checkExistIndex(index);
        Contact[] buffer = new Contact[contacts.length-1];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = contacts[i < index ? i : i + 1];
        }

        contacts = buffer;
        len--;
    }

    public void add(Contact c) {
        if(len == contacts.length) listExpand();
        contacts[len] = c;
        len++;
    }

    public int getLen(){
        return this.len;
    }

    private void checkExistIndex(int index){
        if(index >= contacts.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
    }

    private void listExpand(){
        contacts = Arrays.copyOf(contacts, (int)Math.ceil(contacts.length*1.5));
    }

}
