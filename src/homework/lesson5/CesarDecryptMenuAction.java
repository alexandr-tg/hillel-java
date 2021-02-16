package homework.lesson5;

import java.util.Scanner;

public class CesarDecryptMenuAction implements  MenuAction{
    private Scanner sc;
    private StringCrypter stringCrypter;

    public CesarDecryptMenuAction(Scanner sc, StringCrypter stringCrypter){
        this.sc = sc;
        this.stringCrypter = stringCrypter;
    }

    @Override
    public void doAction() {
        System.out.println("Input your cipher");
        System.out.println(stringCrypter.uncrypt(sc.nextLine()));
    }

    @Override
    public String getName() {
        return "Decode Cesar cipher";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
