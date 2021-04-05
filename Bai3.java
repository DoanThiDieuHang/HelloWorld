//Giải phương trình bậc hai : ax2 + bx + c=0
import java.lang.Math;
public class Bai3 {
    static float x1;
    static float x2;
    public static int GiaiPT(float a, float b, float c){
        float delta = b*b - 4*a*c;
        if(delta<0){
            x1=x2=0;
            return 0;
        }
        else if(delta==0){
            x1 = x2 = -b/(2*a);
            return 1;
        }
        else{
            delta = (float) Math.sqrt(delta);
            x1 = (-b + delta) / (2*a);
            x2 = (-b - delta) / (2*a);
            return 2;
        }
    }
    public static void main(String[] args)
    {
        float a=2,b=1,c=-1;
        if (a==0) System.out.println("Nhap lai a");

        int num = GiaiPT(a,b,c);
        if(num == 0) {
        System.out.println("Phuong trinh da cho vo nghiem");
        }
        else if(num == 1){
        System.out.println("Phuong trinh da cho co nghiem kep x= "+ x1);
        }
        else{
        System.out.println("Phuong trinh da cho co hai nghiem phan biet: x1 = "+ x1 + " , x2 = "+ x2);
        }
        //hello bro

    }
}
