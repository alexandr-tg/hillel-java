package homework.lesson5;

public class XorSymbolCrypter implements SybbolCrypter {
    private int key;

    public XorSymbolCrypter(int key){
        this.key = key;
    }

    @Override
    public char crypt(char c) {
        return (char)(c^key);
    }

    @Override
    public char uncrypt(char c) {
        return crypt(c);
    }
}
