 
 // CONVERSOR DE UNIDADES.

import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {
     Scanner scan = new Scanner(System.in);

     System.out.println("=== CONVERSOR DE UNIDADES ===");
     System.out.println("1 - Quilômetros para milhas.");
     System.out.println("2 - Celsius para Fahrenheit.");
     System.out.println("3 - Quilogramas para libras.");
     System.out.println("0 - Sair.");

     int opcao = 0;
     System.out.print("Escolha uma opção: ");
     opcao = scan.nextInt();

         while (opcao != 0) {
             switch (opcao) {
                 case 1:
                     System.out.println("Digite quantos km: ");

                       double km = scan.nextDouble();
                       double milhas = km * 0.621371;

                         System.out.println(km + " km = " + milhas + " milhas.");

                             System.out.print("Escolha uma opção novamente: ");
                             opcao = scan.nextInt();
                             
                     break;
                    
                 case 2:
                     System.out.println("Digite a temperatura em celsius: ");
                     
                       double celsius = scan.nextDouble();
                       double fahren = (celsius * 9/5) + 32;

                         System.out.println(celsius + " °C = " + fahren + " °F");

                             System.out.println("Escolha uma opção novamente: ");
                             opcao = scan.nextInt();
                             
                     break;

                 case 3:                    
                     System.out.println("Digite quantos kg: ");

                       double kg = scan.nextDouble();
                       double libras = kg * 2.20462;

                         System.out.println(kg + " kg = " + libras + " libras.");

                             System.out.println("Escolha uma opção novamente: ");
                             opcao = scan.nextInt();
                             
                     break;    

                 default:
                             System.out.println("Opção inválida, tente outra: ");
                             opcao = scan.nextInt();
                             
                    break;
           }
            
         }
         System.out.println("Escolha: " + opcao + ".");
         System.out.println("Encerrando! Até logo...");   
         scan.close();        
     }
 }
