//Giai he phuong trinh bac nhat 2 an
public class Bai4 {
    public static void main(String[] args) {
        int a=2, b=1, c=4, d=3, e=2, f=7;
        float D, Dx, Dy, x, y;
        System.out.println(a+"*x + " +b+ "*y =  " +c);
        System.out.println(d+"*x + " +e+ "*y =  " +f);
        D = a * e - d * b;
        Dx = c * e - f * b;
        Dy = a * f - d * c;
        if (D == 0) {
        if (Dx + Dy == 0)
            System.out.println( "He phuong trinh co vo so nghiem");
        else
            System.out.println("He phuong trinh vo nghiem");
        }
        else {
        x = Dx / D;
        y = Dy / D;
        System.out.println("He phuong trinh nghiem: ");
        System.out.println("x = " + x);
        System.out.println( "y = " +y);
        }
    }
}
