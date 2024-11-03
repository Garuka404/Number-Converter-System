import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" __   ______             __");
        System.out.println("|  \\ /      \\           |  \\");
        System.out.println(" \\$$|  $$$$$$\\  ______  | $$  _______");
        System.out.println("|  \\| $$   \\$$ |      \\ | $$ /       \\");
        System.out.println("| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
        System.out.println("| $$| $$   __  /      $$| $$| $$");
        System.out.println("| $$| $$__/  \\|  $$$$$$$| $$| $$_____");
        System.out.println("| $$|\\$$    $$ \\$$    $$| $$ \\$$     \\");
        System.out.println(" \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");

        System.out.println("\n\n----------------------------------------------------");
        System.out.println("\n\t[01] Decimal Converter \n\n\t[02] Binary Converter\n\n\t"
                +"[03] Octal Converter \n\n\t[04] Hexadecimal Converter\n\n\t"
                +"[05] Roman Number Converter");

        System.out.print("\n\nEnter Option -> ");
        int option=scan.nextInt();

        if(option==1){
            System.out.println("\n+---------------------------------------+");
            System.out.println("|          Decimal Converter            |");
            System.out.println("+---------------------------------------+");
        }
        else if(option==2){
            System.out.println("\n+---------------------------------------+");
            System.out.println("|          Binary Converter             |");
            System.out.println("+---------------------------------------+");
        }
        else if(option==3){
            System.out.println("\n+---------------------------------------+");
            System.out.println("|           Octal Converter             |");
            System.out.println("+---------------------------------------+");
        }
        else if(option==4){
            System.out.println("\n+---------------------------------------+");
            System.out.println("|         Hexadecimal Converter         |");
            System.out.println("+---------------------------------------+");
        }
        else if(option==5){
            System.out.println("\n+---------------------------------------+");
            System.out.println("|         Roman Number Converter        |");
            System.out.println("+---------------------------------------+");
        }
        else{
            System.out.print("Invalid number try again!!!!!");
        }

    }
}