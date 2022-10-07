package ru.mirea.task4;

public class Matrix
{
    private int vert;
    private int hor;
    private float[][] mtrx = new float[hor][vert];


    public Matrix(int hor, int vert, float[][] mtrx)
    {
        this.hor = hor;
        this.vert = vert;
        this.mtrx = mtrx;
    }

    public void prntMtrx(Matrix one)
    {
        for(int i = 0; i < one.hor; i++)
        {
            for(int j = 0; j < one.vert; j++)
                System.out.print(mtrx[i][j] + " ");
            System.out.println();
        }
    }

    public float[][] getMtrx()
    {
        return this.mtrx;
    }
    public void ADD (Matrix two)
    {
        if (hor != two.hor || vert!= two.vert)
        {
            System.out.println("These can't be added to each other");
            return;
        }
        int h = hor;
        int v = vert;
        float[][] add = new float[h][v];
        for (int i = 0; i < hor; i++)
        {
            for(int j = 0; j < vert; j++)
            {
                add[i][j] = mtrx[i][j] + two.mtrx[i][j];
            }
        }

        for (int i = 0; i < h; i++)
        {
            for(int j = 0; j < v; j++)
            {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }


    }

    public void MULTIPLY( int m)
    {
        float[][] mult = new float[hor][vert];
        for(int i = 0; i < hor; i++)
        {
            for(int j = 0; j < vert; j++)
                mult[i][j] = mtrx[i][j]*m;
        }

        for (int i = 0; i < hor; i++)
        {
            for(int j = 0; j < vert; j++)
            {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void MULTMATRXX(Matrix two)
    {
        if (vert != two.hor)
        {
            System.out.println("These can't be added to each other");
            return;
        }
        int h = hor;
        int v = vert;
        int k = two.vert;
        float[][] onec = mtrx;
        float[][] twoc = two.mtrx;
        float[][] multx = new float[h][k];
        for (int i = 0; i < hor; i++)
        {
            for(int j = 0; j < k; j++)
            {
                multx[i][j] = 0;
                for(int d = 0; d < v; d++)
                    multx[i][j] += onec[i][d]*twoc[d][j];
            }
        }

        for (int i = 0; i < h; i++)
        {
            for(int j = 0; j < k; j++)
            {
                System.out.print(multx[i][j] + " ");
            }
            System.out.println();
        }
    }

}
