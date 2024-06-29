import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if(liczba>0){
            System.out.println("The number is positive");
        } else if (liczba==0) {
            System.out.println("The value equals 0");
        }else{
            System.out.println("The number is negative");
        }
    }
}