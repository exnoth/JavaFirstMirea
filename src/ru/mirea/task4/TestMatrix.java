package ru.mirea.task4;

public class TestMatrix
{
    public static void main(String[] args)
    {
        float[][] mtrx1 = {{2, 4},{4, 5}, {6, 7} };
        float[][] mtrx2 = {{1, 1},{1, 1}, {1, 1}};
        Matrix one = new Matrix(3,2, mtrx1);
        Matrix two = new Matrix(3, 2, mtrx2);
        System.out.println("The first matrix: \n");
        one.prntMtrx(one);
        System.out.println();
        System.out.println("The second matrix: \n");
        two.prntMtrx(two);
        System.out.println();
        System.out.println("ADD: \n");
        one.ADD(two);
        System.out.println();
        System.out.println("MULTIPLY TO AN INT: \n");
        two.MULTIPLY(6);

        float[][] mtrx3 = {{2, 3},{4, 5}, {2, 3} };
        float[][] mtrx4 = {{5, 6, 7},{6, 5, 4}};
        Matrix three = new Matrix(3,2, mtrx3);
        Matrix four = new Matrix(2, 3, mtrx4);
        System.out.println();
        System.out.println("MULTIPLY MATRIXX: \n");
        three.MULTMATRXX(four);

    }
}
