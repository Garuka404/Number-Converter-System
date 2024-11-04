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
            char again='Y';

            while(true){
                if(again=='Y'){
                    String s="";
                    System.out.print("\n\nEnter an Decimal number : ");
                    int num=scan.nextInt();



                    if(num>0){

                        int  num1=0,num2=num;
                        while(num2!=0){
                            num1=num2%2;
                            s=num1+s;
                            num2=num2/2;
                        }
                        System.out.print("\n\tBinary number: "+s);
                        s="";
                        num1=0 ;
                        num2=num;
                        while(num2!=0){
                            num1=num2%8;
                            s=num1+s;

                            num2=num2/8;
                        }
                        System.out.print("\n\tOctal number: "+s);
                        s="";
                        num1=0 ;
                        num2=num;
                        while(num2!=0){
                            num1=num2%16;
                            if(num1>=10){
                                if(num1==10){
                                    s="A"+s;
                                }
                                else if(num1==11){
                                    s="B"+s;
                                }
                                else if(num1==12){
                                    s="C"+s;
                                }
                                else if(num1==13){
                                    s="D"+s;
                                }
                                else if(num1==14){
                                    s="E"+s;
                                }
                                else{
                                    s="F"+s;
                                }
                            }
                            else{
                                s=num1+s;
                            }
                            num2=num2/16;
                        }
                        System.out.print("\n\tHexadecimal number: "+s);
                        break;



                    }else{
                        System.out.print("\n\tInvalid input..");

                        System.out.print("\n\nDo you want to input number again(Y/N) ->  : ");
                        again=scan.next().charAt(0);



                    }
                }else{
                    System.out.print("no no no");
                    break;
                }
            }

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