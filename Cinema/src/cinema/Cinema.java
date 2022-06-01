package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        System.out.println("Choose the option: 1 - cinema room view, 2 - profit, 3 - ticket price");
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println("Enter the number of rows:");
                int rows = scanner.nextInt();
                System.out.println("Enter the number of seats in each row:");
                int seats = scanner.nextInt();
                System.out.println("$" + profitCalc(rows, seats));
                break;
            case 3:
                System.out.println("Enter the number of rows:");
                rows = scanner.nextInt();
                System.out.println("Enter the number of seats in each row:");
                seats = scanner.nextInt();
                int rowNum = 0;
                int seatNum = 0;
                printCinema(rows, seats, rowNum, seatNum);
                char[][] arrCinema = new char[rows][seats];

                System.out.println("Enter a row number:");
                rowNum = scanner.nextInt();
                System.out.println("Enter a seat number in that row:");
                seatNum = scanner.nextInt();
                System.out.println("Ticket price: $" + ticketPrice(rowNum, rows, seats));
                printCinema(rows, seats, rowNum, seatNum);
                break;
            default:
                System.out.println("No option");
                break;
        }
    }
    static void printCinema(int rows, int seats, int rowNum, int seatNum) {
        System.out.println("Cinema:");
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.print("  ");
                } else if (i == 0) {
                    System.out.print(j + " ");
                } else if (j == 0) {
                    System.out.print(i + " ");
                } else if (i == rowNum && j == seatNum){
                    System.out.print("B ");
                } else {
                    System.out.print("S ");
                }
            }
        System.out.println();
        }
    }

    static int profitCalc(int rows, int seats) {
        int profit;
        int seatsTotalNum = rows * seats;
        final int ticketPrice = 10;
        final int ticketPriceReduced = 8;
        String roomType = (seatsTotalNum <= 60 ? "small" : "big");
        switch (roomType) {
            case "small":
                profit = ticketPrice * seatsTotalNum;
                break;
            case "big":
                int ticketPrice1 = ((rows / 2) * (ticketPrice + ticketPriceReduced)) * seats;
                int ticketPrice2 = ((rows / 2) * ticketPrice + (rows - rows / 2) * ticketPriceReduced) * seats;
                profit = (rows % 2 == 0) ? ticketPrice1 : ticketPrice2;
                break;
            default:
                profit = 0;
                break;
           }
        return profit;
    }

    static int ticketPrice(int rowNum, int rows, int seats) {
        int price;
        int seatsTotalNum = rows * seats;
        String roomType = (seatsTotalNum <= 60 ? "small" : "big");
        if ((roomType == "big") && (rowNum > rows / 2)) {
            price = 8;
        } else if ((roomType == "big") && (rowNum <= rows / 2)) {
            price = 10;
        } else {
            price = 10;
        }
        return price;
    }
}
