package homework.contactsBook.menu.actions;

import homework.contactsBook.menu.MenuAction;

public class ExitContactMenuAction implements MenuAction {
    @Override
    public void doAction() {
        System.out.println("Bye!");
    }

    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }
}
