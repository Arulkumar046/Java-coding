import java.util.Scanner;
public class charCounter 
{
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int word, cap =0, small= 0, special=0, number=0, characters;

    String[] st = str.split(" ");
    word = st.length;

    System.out.print("Total words = " + word + "\n");

    for(int j=0; j<word; j++)
    {
        cap =0;
        small= 0;
        special=0;
        number=0;
        System.out.printf("Word = %s\n",st[j]);
    for(int i=0; i<st[j].length(); i++){
    char c = st[j].charAt(i);

      if(c >= 'A' && c <= 'Z')
      {
        cap++;
      }
      else if(c >='a' && c <= 'z')
      {
        small++;
      }
      else if(c >='0' &&c  <=  '9')
      {
        number++;
      }
      else if(c==' ')
      {
        continue;
      }
      else
      {
        special++;
      }
    }
    characters = cap+small+special+number;
    System.out.printf("Total Char = %d\nTotal Caps = %d\nTotal small = %d\nTotal Speacial = %d\nTotal number = %d\n\n",characters, cap, small, special, number);
}
    sc.close();
 }    
}
