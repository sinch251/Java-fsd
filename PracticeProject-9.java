public class ArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] intArray = new int[5];
        
        // Initialize the elements of the array
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        // Access and print the elements of the array
        System.out.println("Elements of intArray:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        // Declare and initialize an array of strings
        String[] strArray = {"Apple", "Banana", "Cherry", "Date"};

        // Access and print the elements of the string array
        System.out.println("\nElements of strArray:");
        for (String fruit : strArray) {
            System.out.println(fruit);
        }

        // Multi-dimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Access and print elements of the 2D array
        System.out.println("\nElements of 2D array (matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}