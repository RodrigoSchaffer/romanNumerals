import java.util.Scanner;

public class Menu {
    public static void menu(int number) {
        
        try (Scanner scan = new Scanner(System.in);){
            
            
            while(number < 0 || number > 100) {
                System.out.println("Digite um número: ");
                number = scan.nextInt();
                
                if (number < 10) {
                    System.out.println(Functions.convertNumber(number));
                }
                else if (number >= 10 && number < 20) {
                    number -= 10;
                    System.out.println("X" + Functions.convertNumber(number));
                }
                else if (number >= 20 && number < 30) {
                    number -= 20;
                    System.out.println("XX" + Functions.convertNumber(number));
                }
                else if (number >= 30 && number < 40) {
                    number -= 30;
                    System.out.println("XXX" + Functions.convertNumber(number));
                }
                else if (number >= 40 && number < 50) {
                    number -= 40;
                    System.out.println("XL" + Functions.convertNumber(number));
                }
                else if (number >= 50 && number < 60) {
                    number -= 50;
                    System.out.println("L" + Functions.convertNumber(number));
                }
                else if (number >= 60 && number < 70) {
                    number -= 60;
                    System.out.println("LX" + Functions.convertNumber(number));
                }
                else if (number >= 70 && number < 80) {
                    number -= 70;
                    System.out.println("LXX" + Functions.convertNumber(number));
                }
                else if (number >= 80 && number < 90) {
                    number -= 80;
                    System.out.println("LXXX" + Functions.convertNumber(number));
                }
                else if (number >= 90 && number < 100) {
                    number -= 90;
                    System.out.println("XC" + Functions.convertNumber(number));
                }
                else if (number == 100) {
                    number -= 100;
                    System.out.println("C" + Functions.convertNumber(number));
                }

            }




        } catch(Exception e) {

        } 
    }
}
