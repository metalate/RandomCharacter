/*
 * Rastgele karakter ve cümle üreten bir kütüphanedir.
 * Java'nın hazır random fonksiyonlarını kullanmadan hazırlanmıştır.
 * 
 * It's a library that produces random characters and sentences.
 * It is prepared without using Java's ready random functions.
 */
package RastgelePackage;

/**
 * Enes UGUR
 * PDP HOMEWORK2    
 */
public class RastgeleKarakter {
    
    private int random;
    
   /*
    * Nanosaniye cinsinden tarihi döndürür.
    *
    * Returns history in nanoseconds.
    */
    
    private long thistime(){
        long time;
        time = System.nanoTime();
        return time;
    }
    
   /*
    * ASCII den yararlanılarak rastgele karakter üretilir.
    *
    * Using ASCII, random character is generated.
    */
    
    public char rand(){
        char character;
        while(true){
            random = (int)((thistime())%123);
            if((random >= 65 && random <= 90) || (random >= 97 && random <= 122))
                break;
        }
        character = (char)random;
        return character;
    }
    
    /*
     * İstenilen miktar kadar rastgele karakter üretir.
     * 
     * Produces as random as the desired amount of characters.
     */
    
    public String rand(int count){
        String svc = "";
        for(int i = 1; i <= count; i++){
            random = rand();
            svc += (char)random;
        }
        return svc;
    }
    
    /*
     * Verilen iki karakter arasında karakter üretir.
     * 
     * Produces characters between two given characters.
     */
    
    public char rand(int v1, int v2){
        while(true){
            random = rand();
            if((random >= v1) && (random <= v2))
                break;
        }
        return (char) random;
    }
    
    /*
     * Gelen karakter dizisinin toplam eleman sayısına göre modunu alıp
     * bu işlemi istenilen miktar kadar devam ettirip karater üretimi.
     * 
     * By taking the mode of the total number of elements of the incoming
     * character series and continuing this operation for the desired amount,
     * and producing the carate.
     */
    
    public String rand(String characters){
        String str = "";
        int total = characters.length();
        int count = (int)((thistime())%4);
        while(true){
            if(count == 0){
                count = (int)((thistime())%4);
            }
            else break;
        }
        for (int i = 0; i < count; i++){
            random = (int)((thistime())%total);
            str += characters.charAt(random);
        }
        return str;
    }
    
    /*
     * Üretilen karakterleri boşluk koyarak cümle haline getirme.
     * 
     * Making the generated characters into sentences by putting spaces.
     */
    
    public String sentence(int space){
        
        int indis = 0, a = 0;
        int size = space + 10;
        
        String sentence = "";
        char[] charArray = null;
        int[] indisArray = new int[space];
        
        for(int i = 0; i < space; i++){
            while(true){
                indis = (int)((thistime())% size);
                if((indis > 0) && (indis < size)){
                    indisArray[i] = indis;
                    break;
                }
            }
        }
        
        for(int i = 0; i < space; i++){
            for(int j = 1; j < (space - 1); j++){
                if(indisArray[i] == indisArray[j]){
                    indisArray[j] = (int)((thistime())% size);
                }
            }
        }
        
        for(int i = 0; i < space + 10; i++){
            sentence += rand();
        }
        
        charArray = sentence.toCharArray();
        
        for(int i = 0; i < size; i++){
            if(space != 0){
                indis = indisArray[a];
                charArray[indis] = ' ';
                space--;
                a++;
            }
        }
        
        sentence = new String(charArray);
        return sentence;
    }
}
