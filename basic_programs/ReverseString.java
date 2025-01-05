import java.util.*;
class ReverseString {
    public static void main(String[] args){
        String str = "Naveen";
        String rev = "";
        char[] ch = str.toCharArray();
        for(int i =0; i < ch.length; i++){
            rev=ch[i]+rev;
        }
        System.out.println(rev);
    }

}