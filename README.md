# What did we learn 
## JOptionPane (Input 1)
- What JOptionPane is — a pop-up dialog box that pauses program execution and waits for the user to type something, making programs more interactive
- All input from JOptionPane comes in as a String by default, even if the user types a number
- How to use JOptionPane.showInputDialog("message") with a message prompt to request input from the user
- IntelliJ automatically imports required packages (like javax.swing.JOptionPane) — you can narrow the import to just the specific class rather than the whole library to keep file size smaller
## Parsing
- What parsing means — converting a String into a usable numeric data type so you can perform math on it
- The difference between primitive types (lowercase int) and wrapper classes (uppercase Integer) — wrapper classes add extra methods and functionality
- How to use Integer.parseInt(string) to extract and convert a numeric string into an integer
- Combining JOptionPane input and parsing into a single line of code is possible but reduces readability
## Scanner Class (Input 3)
- How to create a Scanner object using Scanner scanner = new Scanner(System.in) to read input from the console/keyboard
- The Scanner uses whitespace as its default delimiter, so users can enter multiple values separated by spaces on one line
- Methods like scanner.nextInt() pause execution and wait for the user to type the expected data type
- Passing non-numeric input to nextInt() will throw an error — the method is strict about data types
- You need to import java.util.Scanner before using it
- Closing the scanner with scanner.close() is good practice, though modern Java handles it automatically
- Prompts for the Scanner must be separate print statements (unlike JOptionPane which takes a message directly)
## Order of Operations with Strings and Integers
- Using + with a String and integers concatenates instead of adding — Java reads left to right, so it joins them as text rather than doing math
- Wrapping the numeric portion in parentheses forces arithmetic to happen first before concatenation
## General
- Always test with consistent data so you can verify results reliably
- Storing input in a variable is useful if you need that value again later; otherwise it can be used immediately inline



