import java.util.Scanner;
public class teclado3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b,c;
        System.out.println("Ingresa tu anio de nacimiento ");
        a=sc.nextInt();
        b=(int) (2024-a);
        System.out.println("Tu edad es : "+ b);
    }
    
}
