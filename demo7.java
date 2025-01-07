import java.util.Scanner;

public class demo7{
    public static void main(String[] args) {
        String name;
        int age;
        String phno;

        Scanner  s = new Scanner(System.in);
        System.out.println("enter username");
         name = s.nextLine();
        System.out.println("enter age");
         age = s.nextInt();
        System.out.println("enter phno");
        phno = s.nextLine();
        System.out.println("hello "+name +"ur age is "+age +"your phno is"+phno);

        s.close();
    }
}