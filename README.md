# DivisionProgram

## Description
This Java project demonstrates the use of exception handling with a custom exception class, `DivisionException`. The program allows users to input a numerator and denominator, performs division, and handles cases where the denominator is zero by throwing a custom exception. This project showcases basic exception handling principles, including `try-catch-finally` blocks and user-defined exceptions.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `DivisionProgram.java` and `DivisionException.java` files, and execute the `DivisionProgram` class. The program will prompt the user to input a numerator and denominator, then perform division and display the result or an error message if division by zero is attempted.

### Example Output
Enter numerator: 10 Enter denominator: 2 Result: 5.0

Enter numerator: 10 Enter denominator: 0 You cannot divide by zero

### Key Features:
- **Custom Exception Handling**: Demonstrates the creation of a custom exception class (`DivisionException`) to handle division by zero errors.
- **Exception Handling Blocks**: Utilizes `try-catch-finally` to handle and manage exceptions gracefully.

### Methods:
- `divide(double numerator, double denominator)`: Performs division and throws a custom `DivisionException` if the denominator is zero.
- **`DivisionException` Class**: Custom exception class that provides a specific message when division by zero occurs.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
