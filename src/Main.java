// Name: Isabella Livingston
// Date: 30 October 2022
// Description: Finds the Maximum Amount of Plus Signs in Array

// Main Project
public class Main {
    // Main Method
    public static void main(String[] args) {

        // Declaring 2 dimensional array
        char[][] input = {
                {'+', '-', '-', '-', '+', '-', '-', '-', '-', '-'},
                {'-', '-', '+', '-', '-', '-', '+', '+', '-', '+'},
                {'+', '+', '-', '-', '-', '-', '-', '+', '+', '-'},
                {'+', '-', '-', '+', '-', '+', '-', '+', '-', '+'},
                {'-', '-', '-', '+', '-', '-', '+', '-', '-', '+'},
                {'+', '+', '+', '-', '+', '-', '-', '+', '+', '-'},
                {'-', '-', '+', '+', '-', '-', '+', '+', '-', '+'},
                {'+', '+', '-', '-', '+', '+', '-', '-', '-', '-'},
                {'-', '+', '+', '-', '-', '+', '-', '+', '-', '+'},
                {'-', '+', '+', '+', '-', '-', '-', '-', '-', '-'}
        };

        // Prints the maximum of plus signs in row or column
        System.out.println(getMax(input));
    }

    // Get Max Method
    public static int getMax(char[][] input){

        // Declaring Variables
        int total_plus_signs_in_row;
        int total_plus_signs_in_column;
        int most_plus_signs = 0;

        // Uses for loops to look at 2 dimensional array
        for (int row = 0; row < input.length; row++){

            // resets values
            total_plus_signs_in_row = 0;
            total_plus_signs_in_column = 0;

            for (int column = 0; column < input.length; column++){
                // looks at row
                System.out.print(input[row][column]);

                // looks at column
                //System.out.print(input[column][row]);

                // Adds the total amount of plus signs in row and column
                if (input[row][column] == '+'){
                    total_plus_signs_in_row += 1;
                }
                if (input[column][row] == '+'){
                    total_plus_signs_in_column += 1;
                }

            }

            // Finds the maximum of plus signs in row or column
            most_plus_signs = Math.max(Math.max(total_plus_signs_in_row , total_plus_signs_in_column), most_plus_signs);

            // Goes to next line of array
            System.out.println(" ");

        }

        // Returns the maximum of plus signs in row or column
        return most_plus_signs;
    }
}