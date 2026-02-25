package CLase4;

import java.util.Scanner;

public class Guia1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Se desea realizar una 
        estadistica de los pesos de los 
        alumnos de un colegio de acuerdo con la 
        siguiente tabla*/
        int rango1= 0, rango2=0, rango3=0, rango4 = 0;
        System.out.print("Cuantos alumnos:");
        int cantidad= sc.nextInt();

        for(int i=1; i<= cantidad;i++){

        System.out.print("Digite el peso del alumno:"+i+":");
        int peso=sc.nextInt();
        
        if (peso <40){ 
            rango1++;//rango acumulador 
            System.out.println("menos de 40 kg");
        }else{
            if(peso>=40 && peso < 50){
                rango2++;
                System.out.println("entre 40 y 50 kg");
            }else{
                if(peso>= 50 && peso < 60){
                    System.out.println("mas de 50 kg y menos de 60 kg");
                }else{
                    System.out.println("mas o igual a 60kg");
                }
            }
            

        } 
        } 
        System.out.println("menos de 40 kg =>" +rango1);
        System.out.println("entre 40 y 50 kg");
        sc.close();   
    }
}