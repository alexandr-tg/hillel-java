package homework.lesson5;

import java.util.Scanner;

public class XOREncryptMenuAction implements MenuAction{
    private Scanner sc;
    private StringCrypter stringCrypter;

    public XOREncryptMenuAction(Scanner sc, StringCrypter stringCrypter){
        this.sc = sc;
        this.stringCrypter = stringCrypter;
    }

    @Override
    public void doAction() {
        System.out.println("Input your String");
        System.out.println(stringCrypter.crypt(sc.nextLine()));
    }

    @Override
    public String getName() {
        return "Encode in XOR";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
