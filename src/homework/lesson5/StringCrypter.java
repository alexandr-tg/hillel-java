package homework.lesson5;

public class StringCrypter {
    private SybbolCrypter symbolCrypter;

    public StringCrypter(SybbolCrypter symbolCrypter){
        this.symbolCrypter = symbolCrypter;
    }

    public String crypt(String s){
        char[] result = s.toCharArray();
        for(int i = 0; i < result.length; i++){
            result[i] = symbolCrypter.crypt(result[i]);
        }
        return String.valueOf(result);
    }

    public String uncrypt(String s){
        char[] result = s.toCharArray();
        for(int i = 0; i < result.length; i++){
            result[i] = symbolCrypter.uncrypt(result[i]);
        }
        return String.valueOf(result);
    }
}
