package ScanWarmUp;
import java.util.Scanner;
public class scanrepl {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1= scan.next();
        int price1= scan.nextInt();
        System.out.println("Enter Item2 and its price:");
        String item2= scan.next();
        int price2= scan.nextInt();
        System.out.println("Enter Item3 and its price:");
        String item3= scan.next();
        int price3= scan.nextInt();
        int totalprice=price1+price2+price3;
        String report="Item1: "+item1+"Price: "+price1+"Item2: "+item2+"Price: "+price2+"Item3: " +item3+"Price:"+price3;
        System.out.println(report);
        System.out.println("Total price: "+totalprice);}}




