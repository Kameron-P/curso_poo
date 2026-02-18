import java.util.Scanner;

public class Condicinales {
    public static void main (String[]args){
    //leer 2 numeros y deducir si estan en orden creciente. a<=b
    Scanner sc = new Scanner(System.in);  
    int a = 0 , b=0;
    System.out.print("Digite a:");
    a = sc.nextInt();//capturamos por teclado el valor de 'a'
    System.out.print("Digite b:");
    b=sc.nextInt();
    //Condicionnal para deducir si estan en orden creciente o decreciente
    if(a<=b){
        System.out.println("Orden creciente");

    } else{
        System.out.println("Orden decreciente");
    }

    sc.close();

    }

}
