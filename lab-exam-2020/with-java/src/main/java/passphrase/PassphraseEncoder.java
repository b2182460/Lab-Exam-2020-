package passphrase;


public class PassphraseEncoder {

    public static String encode(String str){
        StringBuffer sb = new StringBuffer();

        for (int index = 0; index < str.length(); index++) {
            if(Character.isUpperCase(str.charAt(index))) {
                sb.append(Character.toLowerCase(str.charAt(index)));
            } else if (Character.isLowerCase(str.charAt(index))) {
                sb.append(Character.toUpperCase(str.charAt(index)));
            } else {
                sb.append(str.charAt(index));
            }
        }
        return sb.toString();
    }
    public static String decode(String str){

        StringBuffer sb = new StringBuffer();

        for (int index = 0; index < str.length(); index++) {
            if(Character.isLowerCase(str.charAt(index))) {
                sb.append(Character.toUpperCase(str.charAt(index)));
            } else if (Character.isUpperCase(str.charAt(index))) {
                sb.append(Character.toLowerCase(str.charAt(index)));
            } else {
                sb.append(str.charAt(index));
            }
        }
        return sb.toString();
    }
}
