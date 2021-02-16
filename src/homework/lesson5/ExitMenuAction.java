package homework.lesson5;

import homework.lesson5.MenuAction;

public class ExitMenuAction implements MenuAction {
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
