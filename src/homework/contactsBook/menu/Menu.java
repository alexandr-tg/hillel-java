package homework.contactsBook.menu;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private MenuAction[] actions = new MenuAction[0];
    Scanner sc;

    public Menu(Scanner sc){
        this.sc = sc;
    }

    public void addAction(MenuAction action) {
        actions = Arrays.copyOf(actions, actions.length+1);
        actions[actions.length-1] = action;
    }

    public void run() {
        while (true) {
            showMenu();
            int action = getUserMenuIndex();
            if(!validateMenuAction(action)) continue;
            actions[action].doAction();
            if(actions[action].closeAfter()) break;
        }
    }

    private void showMenu(){
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + 1 + " - " + actions[i].getName());
        }
    }

    private int getUserMenuIndex(){
        System.out.println("Please, make your choice:");
        int action = sc.nextInt() - 1;
        sc.nextLine();
        return action;
    }

    private boolean validateMenuAction(int action){
        return action >= 0 && action < actions.length;
    }
}
