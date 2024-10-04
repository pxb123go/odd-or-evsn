import java.util.Scanner;

class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Intager");
        int Num=sc.nextInt();
        if (Num%2==0) {
            System.out.println("even");  
        }
        else {
            System.out.println("odd");  
        }
    }
}