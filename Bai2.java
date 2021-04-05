//Giải phương trình bậc nhất : ax+b=0
public class Bai2 {
    public static void main(String[] args)
    {
        float x=0;
        float a=-1,b=6;
        if (a==0) 
        {
            System.out.println("Nhap lai a"); 
        }
        else 
        {
            if (b==0) x=0;
            else 
            {
                if (a==1)
                {   
                    x= -b;
                }
                if (a>1 || a < 0) 
                {
                    x= -b/a;
                }
            }
            System.out.print("Nghiem cua phuong trinh la :");
            System.out.println(x); 
        }
        
    }
}
