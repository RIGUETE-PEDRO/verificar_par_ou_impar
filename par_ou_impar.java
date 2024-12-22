import java.util.Scanner;

public class par_ou_impar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digiter um numero inteiro");
        int inteiro = scanner.nextInt();
        System.out.println("voce digitou o numero\n" +inteiro);
        
        scanner.nextLine();
        scanner.close();
        par_impar(inteiro);
    }

    public static void par_impar(int inteiro) 
    {
         if (inteiro % 2 == 0) {
            System.out.println("seu numero " + inteiro + " e par");
         }else{
            System.out.println("seu numero " + inteiro + " e impar");
         }
        
    }
}