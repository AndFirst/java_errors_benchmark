package errors;

public class _10_MalformedForLoop {
    /*
    Error 11
    Malformed For Loop
     */
    public static void main(String[] args) {
        /*
        Expected:
            0 0
            0 0
        Received:
            0 -2
            0 -4
         */
        int[][] testData = {
            {-1, -2,},
            {-3, -4, }
        };

        printArray(testData);

        normalizeData(testData);
        printArray(testData);
    }

    private static void normalizeData(int[][] data) {
        int rows = data.length;

        for (int i = 0; i < rows; i++) {
            int columns = data[i].length;
            for (int j = 0; i < columns; i++) { // Error: i should be j
                if (data[i][j] < 0) {
                    data[i][j] = 0;
                }
            }
        }
    }

    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}