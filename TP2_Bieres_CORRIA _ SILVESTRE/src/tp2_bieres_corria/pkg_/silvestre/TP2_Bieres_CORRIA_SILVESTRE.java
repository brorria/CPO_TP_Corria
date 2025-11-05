/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_corria.pkg_.silvestre;

/**
 *
 * @author martincorria
 */
public class TP2_Bieres_CORRIA_SILVESTRE {
    
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson");
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
        
        BouteilleBiere biere_1 = new BouteilleBiere("Heineken", (float) 5,"maison heineken") ;
        
        BouteilleBiere biere_2 = new BouteilleBiere("chouffe", (float) 8,"brasserie vhouffe") ;
        
        BouteilleBiere biere_3 = new BouteilleBiere("megaDemon", (float) 16,"brasserie goudale") ;
        
        
        
        
        
        
        uneBiere.lireEtiquette();  
        autreBiere.lireEtiquette();
        biere_1.lireEtiquette();
        biere_2.lireEtiquette();
        biere_3.lireEtiquette();
        
        System.out.println(uneBiere);
    }
    
}
