package cinema;

import java.util.Scanner;

public class Cinema {
    final static Scanner scanner = new Scanner(System.in);
    static char[][] array;
    static int rows;
    static int seats;
    static int row_num;
    static int seat_num;
    static int tickets = 0;
    static int current_income = 0;

    public static void main(String[] args) {
        initArray();
        while (true) {
            System.out.print("\n");
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int num = inputInteger();
            System.out.print("\n");
            if (num == 1) {
                showSeats();
            } else if (num == 2) {
                buyTicket();
            } else if (num == 3) {
                printStatistics();
            } else {
                break;
            }
        }
    }

    static void initArray() {
        System.out.println("Enter the number of rows:");
        rows = inputInteger();
        rows = checkNegative(rows);
        System.out.println("Enter the number of seats in each row:");
        seats = inputInteger();
        seats = checkNegative(seats);
        array = new char[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                array[i][j] = 'S';
            }
        }
    }

    static int  inputInteger() {
        while (true) {
            try {
                System.out.print("> ");
                String str = scanner.nextLine();
                if (str.equals("exit")) {
                    System.exit(0);
                }
                return Integer.parseInt(str);
            } catch(NumberFormatException e) {
                System.out.println("Error: The number has not integer type!");
                System.out.println("Enter the number:");
            }
        }
    }

    static int  checkNegative(int num) {
        while (num < 0) {
            System.out.println("Error: Size of array can not be negative!");
            System.out.println("Enter the number:");
            num = inputInteger();
        }
        return num;
    }

    static void showSeats() {
        System.out.println("Cinema:");
        for (int i = 0; i < seats; i++) {
            System.out.print(" ");
            System.out.print(i + 1);
        }
        for (int i = 0; i < rows; i++) {
            System.out.print("\n");
            System.out.print(i + 1);
            for (int j = 0; j < seats; j++) {
                System.out.print(" ");
                System.out.print(array[i][j]);
            }
        }
        System.out.println("\n");
    }

    static void buyTicket() {
        int price = 10;

        System.out.println("Enter a row number:");
        row_num = inputInteger();
        System.out.println("Enter a seat number in that row:");
        seat_num = inputInteger();
        checkRowAndSeat();
        checkPlace();
        if (rows * seats > 60 && row_num > rows / 2) {
            price = 8;
        }
        System.out.print("\n");
        System.out.printf("Ticket price: $%d\n", price);
        current_income += price;
    }

    static void checkRowAndSeat() {
        while (row_num < 0 || row_num > rows || seat_num < 0 || seat_num > seats) {
            System.out.println("\nWrong input!\n");
            System.out.println("Enter a row number:");
            row_num = inputInteger();
            System.out.println("Enter a seat number in that row:");
            seat_num = inputInteger();
        }
    }

    static void  checkPlace() {
        while (array[row_num - 1][seat_num - 1] == 'B') {
            System.out.println("\nThat ticket has already been purchased!\n");
            System.out.println("Enter a row number:");
            row_num = inputInteger();
            System.out.println("Enter a seat number in that row:");
            seat_num = inputInteger();
            checkRowAndSeat();
        }
        array[row_num - 1][seat_num - 1] = 'B';
        tickets++;
    }

    static void printStatistics() {
        System.out.printf("Number of purchased tickets: %d\n", tickets);
        countPercentage();
        System.out.printf("Current income: $%d\n", current_income);
        countTotalIncome();
    }

    static void countPercentage() {
        float percentage = (float)(tickets * 100) / (rows * seats);
        System.out.printf("Percentage: %.2f%c\n", percentage, '%');
    }

    static void countTotalIncome() {
        int total_income;

        if (rows * seats <= 60) {
            total_income = rows * seats * 10;
        } else {
            total_income = rows / 2 * seats * 10 + (rows - rows / 2) * seats * 8;
        }
        System.out.printf("Total income: $%d\n", total_income);
    }
}