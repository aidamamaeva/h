import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        Days a = Days.valueOf(scanner.nextLine());
       switch (a){
           case MON,WEN,FRI:
               System.out.println("java lesson");
               break;
           case TUE, THU,SAT:
               System.out.println("practice lesson");
               break;
           case SUN:
               System.out.println("weekend");
               break;
           default:
               System.out.println("no inf");
       }
        System.out.println(a.getTranslation());
    }
}