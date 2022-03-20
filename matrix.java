// Java program for addition of two matrices

import java.io.*;

class matrix {
    
    // Function to print Matrix
    static int[][] printMatrix(int M[][],
            int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
        return M;
    }

    // Function to add the two matrices
    // and store in matrix C
    static int[][] add(int A[][], int B[][],
            int size) {
        int i, j;
        int C[][] = new int[size][size];

        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];

        return printMatrix(C,size);
    }

    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int size = 3;
        System.out.println("enter Matrix A:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter Matrix element"+"["+i+"]"+"["+j+"]:");
                A[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        System.out.println("Enterd Matrix A is:");
        printMatrix(A, size);

        System.out.println("enter Matrix B:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter Matrix element"+"["+i+"]"+"["+j+"]:");
                B[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        System.out.println("Enterd Matrix B is:");
        printMatrix(B, size);
        System.out.println("________________");
        add(A,B, size);
    }
}
