package homework.lesson5;

public class CesarSymbolCrypter  implements SybbolCrypter{
    private int key;

    public CesarSymbolCrypter(int key){
        this.key = key;
    }

    @Override
    public char crypt(char c) {
        return (char)(c+key);
    }

    @Override
    public char uncrypt(char c) {
        return (char)(c-key);
    }
}
