package corejava;

public class Counting1to100 {

    public static void main(String[] args) {
        int rows = 10; // Number of rows in the table
        int columns = 10; // Number of columns in the table
        
        int count = 1; // Start counting from 1
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (count <= 100) {
                    System.out.printf("%-4d", count); // Print the number with padding
                    count++;
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
