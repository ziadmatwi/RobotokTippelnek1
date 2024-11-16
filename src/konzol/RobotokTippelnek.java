package konzol;

import java.util.Random;

public class RobotokTippelnek {

    public static void main(String[] args) {
        System.out.println("Három robot tippel egyet-egyet:");
        /* tippelések beállítása: */
        int szam1;
        /* Random osztály használattal: */
        Random rnd = new Random();
        szam1 = rnd.nextInt(1, 11);
        
        /* Math.random() használattal */
        szam1 = (int)(Math.random() * 10) + 1;
        
        int tipp1, tipp2, tipp3;
        /* Random osztály használattal: */
        tipp1 = rnd.nextInt(1, 11);
        tipp2 = rnd.nextInt(1, 11);
        tipp3 = rnd.nextInt(1, 11);
        
        /* Math.random() használattal */
        tipp1 = (int)(Math.random() * 10) + 1;
        tipp2 = (int)(Math.random() * 10) + 1;
        tipp3 = (int)(Math.random() * 10) + 1;

        /* tippelések kiírása: */
        System.out.println("A kitalálandó szám: " + szam1);
        System.out.println("1. robot tippje: " + tipp1);
        System.out.println("2. robot tippje: " + tipp2);
        System.out.println("3. robot tippje: " + tipp3);

        /* tippelések vizsgálata: */
        boolean voltTalalat = false;
        if(tipp1 == szam1){
            voltTalalat = true;
            System.out.println("Az 1. robot eltalálta!");
        }
        if(tipp2 == szam1){
            voltTalalat = true;
            System.out.println("A 2. robot eltalálta!");
        }
        if(tipp3 == szam1){
            voltTalalat = true;
            System.out.println("A 3. robot eltalálta!");
        }
        if(!voltTalalat){
            System.out.println("Egyik robot sem találta el!");
        }
        
        System.out.println("Egy robot tippelhet háromszor:");
        /* az 1. tipp beállítása: */
        int szam2 = (int)(Math.random() * 10) + 1;
        int tipp = (int)(Math.random() * 10) + 1;

        /* tippelések kiírása és vizsgálata: */
        System.out.println("A kitalálandó szám: " + szam2);
        System.out.println("Az 1. tipp: " + tipp);
        
        if(tipp == szam2){
            System.out.println("Elsőre sikerült eltalálni!");
        }else{
            tipp = (int)(Math.random() * 10) + 1;
            System.out.println("A 2. tipp: " + tipp);
            if(tipp == szam2){
                System.out.println("Másodikra sikerült eltalálni!");
            }else{
                tipp = (int)(Math.random() * 10) + 1;
                System.out.println("A 3. tipp: " + tipp);
                if(tipp == szam2){
                    System.out.println("Harmadikra sikerült eltalálni!");
                }else{
                    System.out.println("Nem siekrült háromból eltalálni!");
                }
            }
        }
    }
    
}
