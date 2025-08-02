import java.util.Scanner;

public class timeTable2 {

    public static void main(String[] args) {
        char group;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** lab timetable***");
        System.out.println("enter your group (A, B, C)");
        group = keyboard.next().charAt(0);
        switch (group) {
            case ('A'):
                System.out.println("10AM");
            break;
            case ('B'):
              System.out.println("11AM");
            break;
            case ('C') :
             System.out.println("1PM");
            break;
            default:
                break;
        }

    }
}