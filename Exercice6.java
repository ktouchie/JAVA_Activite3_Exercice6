import java.util.Scanner;
class Exercice5 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir un nombre naturel:");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while (n>0) {
            sum = sum + (num%10);
            num = num/10;
        }
        System.out.println("La somme des chiffres de " + n + " est " + sum);
    }
}