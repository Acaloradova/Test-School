import java.util.Scanner;

/**
 * Created by Julik on 08.05.2015.
 */
public class LuckyTicket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number (6 digits)");
        String ticket = in.nextLine();
        if (isValidNumber(ticket)) {
            System.out.println(isLucky(ticket));
        } else {
            System.out.println("Run again with 6 digits");
        }
    }

    public static boolean isValidNumber(String ticket) {
        if (ticket.length() != 6) {
            return false;
        }
        try {
            Integer.parseInt(ticket);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isLucky(String ticket) {
        char[] array = ticket.toCharArray();
        int[] ticketArr = new int[6];
        for (int j = 0; j <= 5; j++) {
            Integer ticketInt = Integer.valueOf(array[j] + "");
            ticketArr[j] = ticketInt;
        }
        return isLucky(ticketArr);
    }

    public static boolean isLucky(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i <= 2; i++) sumLeft = sumLeft + array[i];
        for (int i = 3; i <= 5; i++) sumRight = sumRight + array[i];
        System.out.println(sumLeft + " " + sumRight);
        return sumLeft == sumRight;
    }
}

