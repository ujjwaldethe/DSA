package Strings;

public class largestStringLexicographical {
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++)
        {
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println("Largest String : "+largest);
        String name = "hi, i am shradha";
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);
        for(int i=1; i<name.length();i++)
        {
            if(name.charAt(i)==' '&& i<name.length()-1){
                sb.append(name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            }
            else{
                sb.append(name.charAt(i));
            }
        }
        System.out.println(sb.toString());
        }

}
