package homework.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(sc);

        StringCrypter cesarCrypter = new StringCrypter(new CesarSymbolCrypter(2));
        StringCrypter xorCrypter = new StringCrypter(new XorSymbolCrypter(5));

        menu.addAction(new CesarEncryptMenuAction(sc, cesarCrypter));
        menu.addAction(new CesarDecryptMenuAction(sc, cesarCrypter));
        menu.addAction(new XOREncryptMenuAction(sc, xorCrypter));
        menu.addAction(new XORDecryptMenuAction(sc, xorCrypter));
        menu.addAction(new ExitMenuAction());

        menu.run();
    }
}
