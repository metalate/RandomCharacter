/*
 * RastgeleKarakter kütüphanesini kullanarak istenilen miktar kadar
 * karakter ve cümle oluşturan java kodu...
 *
 * Using the "RastgeleCharacter" library, the java code that creates
 * as many characters and sentences as required...
 */
package homework2;

import RastgelePackage.RastgeleKarakter;
import java.util.Scanner;

/**
 * Enes UGUR
 * PDP HOMEWORK2    
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RastgeleKarakter r = new RastgeleKarakter();
        Scanner scan = new Scanner(System.in);
        int choise = 0;
        
        /* MENU */
        while(true){
            
            System.out.println("*************************************************************************************");
            System.out.println("*************************************************************************************");
            System.out.println("*** To produce one character                                                    : 1");
            System.out.println("*** To produce a certain amount of characters                                   : 2");
            System.out.println("*** To produce a character between two desired characters                       : 3");
            System.out.println("*** To produce many character that you want from within your character sequence : 4");
            System.out.println("*** To produce a sentence                                                       : 5");
            System.out.println("*** To end the process                                                          : 0");
            System.out.println("*************************************************************************************");
            System.out.println("*************************************************************************************");

            choise = scan.nextInt();

            while(true){
                if((choise < 0) || (choise > 5)){
                    System.out.println("Wrong entiry!!! Please reselect : ");
                    choise = scan.nextInt();
                }
                else{
                    break;
                }
            }
            
            if(choise == 0){
                break;
            }
            
            switch(choise){
                
                case 1:
                    
                    System.out.println("Produced character : " + r.rand());
                    break;
                
                case 2:
                    
                    System.out.println("How many characters would you like to produce : ");
                    int counter = scan.nextInt();
                    
                    System.out.println("Produced character : " + r.rand(counter));
                    break;
                
                case 3:
                    
                    System.out.println("Do you want to produce characters between which characters : ");
                    
                    System.out.println("First : ");
                    String s1 = scan.next();
                    char[] c1 = s1.toCharArray();
                    int a1 = (int)c1[0];
                    
                    System.out.println("Second : ");
                    String s2 = scan.next();
                    char[] c2 = s2.toCharArray();
                    int a2 = (int)c2[0];
                    
                    System.out.println("Produced character : " + r.rand(a1,a2));
                    break;
                
                case 4:
                    
                    System.out.println("Enter the character index : ");
                    String character = scan.next();
                    //System.out.println("How many characters would you like to produce : ");
                    //int counter2 = scan.nextInt();
                    System.out.println("Produced character : " + r.rand(character));
                    break;
                
                case 5:
                    
                    System.out.println("How many characters in your sentence : ");
                    int word = scan.nextInt();
                    
                    System.out.println("Produced sentence : " + r.sentence(word-1));
                    break;
            }
        }
    }
}
