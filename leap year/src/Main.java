import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("enter a year: ");
        year = scanner.nextInt();

        if(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))){
            System.out.println(year+" leap year.");
        }else{
            System.out.println(year+" not a leap year.");
        }
    }
}
