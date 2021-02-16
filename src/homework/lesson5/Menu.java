package homework.lesson5;

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
        System.out.println("Please, make your choice:");
        while (true) {
            for (int i = 0; i < actions.length; i++) {
                System.out.println(i + 1 + " - " + actions[i].getName());
            }

            int action = sc.nextInt() - 1;
            sc.nextLine();

            if(action >= 0 && action < actions.length){
                actions[action].doAction();
                if(actions[action].closeAfter()){
                    break;
                }
            } else {
                System.out.println("Incorrect menu number, try again");
            }
        }
    }
}
