package Day2;
import java.util.Scanner;
public class tshirt {
    String tsize;
    String tcolor;

    public tshirt(String size, String color) {
        tsize = size;
        tcolor = color;
    }
        public static void main (String[]args){
        int a=50;
        int b=100;
            System.out.println("Number of Black tshirts ="+a);
            Scanner num = new Scanner(System.in);
            int redtshirtcount = num.nextInt();
            System.out.println("Number of red tshirts = " + redtshirtcount);
            int greentshirtcount = num.nextInt();
            System.out.println("Number of green tshirts = " + greentshirtcount);
            int yellowtshirt = num.nextInt();
            System.out.println("Number of yellow tshirts = " + yellowtshirt);
            int bluetshirt = num.nextInt();
            System.out.println("Number of blue tshirts = " + bluetshirt);
            System.out.println("Total no of Tshirts ordered:"+b);
        }

    }
