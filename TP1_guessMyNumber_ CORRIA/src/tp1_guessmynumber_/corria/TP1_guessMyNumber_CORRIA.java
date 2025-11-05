/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_.corria;
import java.util.Random;
import java.util.Scanner;




/**
 *
 * @author martincorria
 */
public class TP1_guessMyNumber_CORRIA {

    /**
     * @param args the command line arguments
     */
    


    public static void main(String[] args) {
        
        System.out.println("Veuillez choisir une difficultée :\n 1 - facile\n 2 - moyen\n 3 - difficile");
        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();
        
        
        
        if (mode == 1){
        
        
            System.out.println("Veuillez choisir un nombre entre 0 et 100 :");
        
            int nbr = sc.nextInt();
            int cpt = 0;

            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(101); // 0 à 100 inclus


            while (nbr != n) {
            
                if (nbr < 0 || nbr > 100) {
                    System.out.println("Le nombre doit être entre 0 et 100. Réessayez :");
                nbr = sc.nextInt();
        
                {
                if (nbr > n) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Trop petit !");
                }

                cpt++;
                System.out.println("Essayez encore :");
                nbr = sc.nextInt();
            }
        }
                }
        System.out.println("Bien joué ! Vous avez trouvé en " + cpt + " essais.");
        sc.close();
        

    }
        
        
        if (mode == 2){
            System.out.println("Veuillez choisir un nombre entre 0 et 100 en 10 essaies :");
        
            int nbr = sc.nextInt();
            int cpt = 0;

            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(101); // 0 à 100 inclus


            while (nbr != n && cpt != 10) {
            
                if (nbr < 0 || nbr > 100) {
                    System.out.println("Le nombre doit être entre 0 et 100. Réessayez :");
                nbr = sc.nextInt();
        
                {
                if (nbr > n) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Trop petit !");
                }

                cpt++;
                System.out.println("Essayez encore :");
                nbr = sc.nextInt();
            }
        }
                }
        System.out.println("Bien joué ! Vous avez trouvé en " + cpt + " essais.");
        sc.close();
        
            }
        if (mode == 3){
            System.out.println("Veuillez choisir un nombre entre 0 et 100 en 5 essaies :");
        
            int nbr = sc.nextInt();
            int cpt = 0;

            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(101); // 0 à 100 inclus


            while (nbr != n && cpt != 5) {
            
                if (nbr < 0 || nbr > 100) {
                    System.out.println("Le nombre doit être entre 0 et 100. Réessayez :");
                nbr = sc.nextInt();
        
                {
                if (nbr > n) {
                    System.out.println("Trop grand !");
                } else {
                    System.out.println("Trop petit !");
                }

                cpt++;
                System.out.println("Essayez encore :");
                nbr = sc.nextInt();
            }
        }
                }
        System.out.println("Bien joué ! Vous avez trouvé en " + cpt + " essais.");
        sc.close();
        
        }
        
        
        
        
        
        }
}
    
    
    

