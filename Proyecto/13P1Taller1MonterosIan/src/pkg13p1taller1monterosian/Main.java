/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13p1taller1monterosian;
import java.util.Scanner;
/**
 *
 * @author ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here
                System.out.print("Actividad 1");
        System.out.println("Nombre: Ian Monteros ");
        System.out.println("Fecha: 10/11/2023 ");
        System.out.println("Fecha: 10/11/2023 ");
        System.out.println("CALCULADORA");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double numero1=scanner.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double numero2=scanner.nextDouble();
        double suma=numero1+numero2;
        double resta=numero1-numero2;
        double divi=numero1/numero2;
        double multi=numero1*numero2;
        System.out.println("La suma de" +numero1+"y"+numero2+"es: "+suma);
        System.out.println("La resta de" +numero1+"y"+numero2+"es: "+resta);
        System.out.println("La division de" +numero1+"y"+numero2+"es: "+divi);
        System.out.println("La multiplicacion de" +numero1+"y"+numero2+"es: "+multi);
    }
    }
