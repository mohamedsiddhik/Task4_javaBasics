//1. Java Program to Concatenate Two Arrays

public  class Javaex1
{
    public static void main(String[] args) {
        int a[] = {9,8,7,6,5};
        int b[] = {90,80,70,60,50};

        int a1=a.length;
        int b1=a.length;
        int c1 = a1+ b1;
        int[] c = new  int[c1];

        for (int i=0;i<a1;i++)
        {
            c[i]=a[i];
        }
        for (int i=0;i<b1;i++)
        {
            c[a1+ i]=b[i];
        }

        for(int i=0;i<c1;i++)
        {
            System.out.println(c[i]);
        }
    }
}