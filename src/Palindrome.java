import java.util.Scanner;

public class Palindrome {
    private  String word;
    public String reverse="";
    String original;
    Scanner scanner=new Scanner(System.in);
    public  void testWord(){
        System.out.print("Word:");
        original=scanner.nextLine();
        setWord(original);
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (reverse.equals(getWord()))
        {
            System.out.println("Palidrome");
        }
        else{
            System.out.println("Not Palidrome");
        }
    }

    public String getWord() {
        return word;
    }

    public void setWord(String str) {
        this.word = str;
    }
}
