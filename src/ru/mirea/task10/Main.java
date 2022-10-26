package ru.mirea.task10;

import java.util.Comparator;
import java.util.Scanner;
public class Main
{
    private Comparator<Student> cmp;
    private Student[] idNumber;
    public Main(Comparator<Student> comp, Student[] stud)
    {
        cmp = comp.reversed();
        idNumber = stud;
    }

    public void setCmp(Comparator<Student> cmp)
    {
        this.cmp = cmp.reversed();
    }

    public void setArray(Student[] stud)
    {
        idNumber = stud;
    }

    public void outArray(){

        for(Student s : idNumber)

            System.out.println(s);

    }

    private int partition(Student[] s, int left, int right){

        Student pivot = s[(left+right)/2];

        int i=left;

        int j=right;

        for(;;){

            while(cmp.compare(s[i], pivot)<0)

                i++;

            while(cmp.compare(pivot, s[j])<0)

                j--;

            if(i>=j) break;

            Student tmp=s[i];

            s[i]=s[j];

            s[j]=tmp;

        }

        return j;

    }

    private void _qsort(Student[] s, int left, int right){

        if(left<right) {

            int p = partition(s, left, right);

            _qsort(s, left, p);

            _qsort(s, p + 1, right);

        }

    }

    private void merge(Student[] s, Student[] a, Student[] b, int left, int right){

        int i=0, j=0, k=0;

        while(i<left && j<right){

            if(cmp.compare(a[i], b[j])<0)

                s[k++]=a[i++];

            else

                s[k++]=b[j++];

        }

        while(i<left)

            s[k++]=a[i++];

        while(j<right)

            s[k++]=b[j++];

    }

    private void msort(Student[] s, int n){

        if(n<2) return;

        int mid = n/2;



        Student[] left = new Student[mid];

        Student[] right = new Student[n-mid];



        for(int i=0;i<mid;++i)

            left[i]=s[i];

        for(int i=mid;i<n;++i)

            right[i-mid]=s[i];

        msort(left, mid);

        msort(right, n-mid);

        merge(s, left, right, mid, n-mid);

    }

    public void quicksort(){

        _qsort(idNumber, 0, idNumber.length-1);

    }

    public void mergeSort(){

        msort(idNumber, idNumber.length);

    }

    public void mergeAndSort(Student[] s1, Student[] s2){

        merge(new Student[s1.length+s2.length], s1, s2, s1.length, s2.length);

        mergeSort();

    }





    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0]=new Student("Name1", "Surname5", "Specialty1", 2, "Group2");

        students[1]=new Student("Name2", "Surname4", "Specialty3", 4, "Group3");

        students[2]=new Student("Name3", "Surname3", "Specialty5", 5, "Group5");

        students[3]=new Student("Name4", "Surname2", "Specialty4", 3, "Group1");

        students[4]=new Student("Name5", "Surname1", "Specialty2", 1, "Group4");

        System.out.println("Choose a field to sort:");

        System.out.println("1) Name\n2) Surname\n3) Specialty\n4) Year\n5) Group");

        Scanner scanner = new Scanner(System.in);



        Comparator<Student> cmp;

        while(true){

            int choice = scanner.nextInt();

            if(choice==1) {

                cmp = Comparator.comparing(Student::getName);

                break;

            }else if(choice==2) {

                cmp = Comparator.comparing(Student::getSurname);

                break;

            }else if(choice==3) {

                cmp = Comparator.comparing(Student::getSpecialty);

                break;

            }else if(choice==4) {

                cmp = Comparator.comparing(Student::getYear);

                break;

            }else if(choice==5) {

                cmp = Comparator.comparing(Student::getGroup);

                break;

            }else System.out.println("Нет такого варианта");

        }

        Main main = new Main(cmp, students);

        main.quicksort();



        main.outArray();

    }
}
