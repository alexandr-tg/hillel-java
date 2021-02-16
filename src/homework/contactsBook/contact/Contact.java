package homework.contactsBook.contact;

public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        validatePhoneOfContact(phone);
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    private void validatePhoneOfContact(String phone) {
            String phoneRegex = "(?:\\+?38)?(0[1-9]{1}[0-9]{8})$";
            if(!phone.matches(phoneRegex)) throw new IllegalArgumentException();
    }
}
