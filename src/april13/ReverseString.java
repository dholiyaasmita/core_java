package april13;

public class ReverseString extends Object{
    public static void main(String[] args) {
        //can use char[] string1 = string.toCharArray();
        String string = "pragra";
        String output = "";
        char ch;
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            output = ch+output;
        }
        System.out.println("reverse String is: "+output.toString());

    }
}
