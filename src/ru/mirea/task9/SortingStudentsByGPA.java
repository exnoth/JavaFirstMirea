package ru.mirea.task9;

import java.util.Comparator;

public class SortingStudentsByGPA
{
    private StudentClass studcl;
    Comparator<Student> comparator = new Comparator<Student>()
    {
        @Override
        public int compare(Student one, Student two) {
            return Double.compare(one.gpa, two.gpa);
        }

        @Override
        public boolean equals(Object obj)
        {
            return this == obj;
        }
    };

    public SortingStudentsByGPA(int n)
    {
        studcl = new StudentClass(n);
    }

    private Student[] sortMerge(Student[] stud)
    {
        if(stud == null)
            return null;
        if(stud.length < 2)
            return stud;
        Student[] left = new Student[stud.length/2];
        System.arraycopy(stud, 0, left, 0, stud.length/2);
        Student[] right = new Student[stud.length - stud.length/2];
        System.arraycopy(stud, stud.length/2, right, 0, stud.length - stud.length/2);

        left = sortMerge(left);
        right = sortMerge(right);

        return mergeArray(left,right);
    }

    private Student[] mergeArray(Student[] left, Student[] right)
    {
        Student[] merged = new Student[left.length + right.length];
        for(int i = 0; i < merged.length; i++)
            merged[i] = new Student();
        int lenleft = left.length;
        int lenright = right.length;
        while(lenleft > 0 && lenright > 0)
        {
            if(this.comparator.compare(left[left.length - lenleft], right[right.length - lenright]) > 0)
            {
                merged[merged.length - lenleft - lenright] = left[left.length - lenleft];
                lenleft--;
            }
            else
            {
                merged[merged.length - lenleft - lenright] = right[right.length - lenright];
                lenright--;
            }
        }

        while(lenleft > 0)
        {
            merged[merged.length - lenleft] = left[left.length - lenleft];
            lenleft--;
        }

        while(lenright > 0)
        {
            merged[merged.length - lenright] = right[right.length - lenright];
            lenright--;
        }

        return merged;
    }


    void sortGPAMerge()
    {
        this.studcl.students = sortMerge(this.studcl.students);
    }

    private void quickSort(Student[] stud, int l, int h)
    {
        if(stud.length == 0)
            return;
        if(l >= h)
            return;
        int mid = l + (h - l)/2;
        Student base = new Student();
        base = stud[mid];
        Student temp = new Student();
        int i = l, j = h;
        while(i <= j)
        {
            while(this.comparator.compare(stud[i], base) > 0)
            {
                i++;
            }

            while(this.comparator.compare(stud[j], base) < 0)
            {
                j--;
            }

            if(i <= j)
            {
                temp = stud[i];
                stud[i] = stud[j];
                stud[j] = temp;
                i++;
                j--;
            }
        }

        if (l < j)
            quickSort(stud,l,j);
        if(h > i)
            quickSort(stud, i, h);

    }

    void sortGPAQuick()
    {
        quickSort(this.studcl.students, 0, this.studcl.students.length-1);
    }

    void printstud()
    {
        studcl.printall();
    }


}
