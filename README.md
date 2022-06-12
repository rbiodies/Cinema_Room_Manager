# Cinema_Room_Manager
### The objective of this project:
At the start, the program should read two positive integer numbers that represent the number of **rows** and **seats** in each row. Then, it should print a **menu** with the following four items:
- **Show the seats** should print the current seating arrangement. The empty seats should be marked with an S symbol, and taken seats are marked with a B symbol.
- **Buy a ticket** should read the seat coordinates from the input and print the ticket price like in the previous stage. After that, the chosen seat should be marked with a B when the item Show the seats is called.
- **Statistics** should print the following information:
  - The number of purchased tickets;
  - The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;
  - Current income;
  - The total income that shows how much money the theatre will get if all the tickets are sold.
- **Exit** should stop the program.
### Example:
```
Enter the number of rows:
> six

Error: The number has not integer type!

Enter the number:
> -6
Enter the number of seats in each row:
> 6

Error: Size of array can not be negative!

Enter the number of rows:
> 6
Enter the number of seats in each row:
> 6

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

Cinema:
 1 2 3 4 5 6
1 S S S S S S
2 S S S S S S
3 S S S S S S
4 S S S S S S
5 S S S S S S
6 S S S S S S


1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 0
Percentage: 0.00%
Current income: $0
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 1
Percentage: 2.78%
Current income: $10
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

That ticket has already been purchased!

Enter a row number:
> 10
Enter a seat number in that row:
> 20

Wrong input!

Enter a row number:
> 4
Enter a seat number in that row:
> 4

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 2
Percentage: 5.56%
Current income: $20
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

Cinema:
 1 2 3 4 5 6
1 B S S S S S
2 S S S S S S
3 S S S S S S
4 S S S B S S
5 S S S S S S
6 S S S S S S


1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 0
```
