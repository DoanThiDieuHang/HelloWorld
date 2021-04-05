//Tìm max của 3 biến a,b,c (Dùng if, if...else, ?:)
public class Bai1
{
    public static void main(String[] args)
    {
        int a=21,b=13,c=9;
        int max1 = a;
        if (max1 < b) max1 =b;
        if (max1 < c) max1 =c;
        System.out.println(max1);

        int max2;
        if (a> b && a>c) max2 = a;
        else if(b>c) max2=b;
        else max2 =c;
        System.out.println(max2);

        int max3 = a>b? a :b;
        max3 = max3 >c? max3:c;
        System.out.println(max3);


    }
}