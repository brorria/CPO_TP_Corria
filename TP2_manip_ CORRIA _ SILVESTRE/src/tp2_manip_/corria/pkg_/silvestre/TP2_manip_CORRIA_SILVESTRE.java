/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_.corria.pkg_.silvestre;

/**
 *
 * @author martincorria
 */
public class TP2_manip_CORRIA_SILVESTRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        Tartiflette temp=assiette1;
        assiette1=assiette2;
        assiette2=temp;
        System.out.println ("assiette 1 " + assiette1.nbCalories +" calories ");
        System.out.println ("assiette 2 " + assiette2.nbCalories +" calories ");
        System.out.println ("assiette 3 " + assiette3.nbCalories + " calories ");
        assiette2.nbCalories+=100;
        System.out.println (assiette2.nbCalories);
        System.out.println (assiette3.nbCalories);
        
    }
    
}
