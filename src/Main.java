import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char c='Y';

        do{

            System.out.println("\n __   ______             __");
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

                while(again=='Y'){
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
                        //break;

                        // break;
                        System.out.print("\n\nDo you want to go to homepage (Y/N) ->  : ");
                        c=scan.next().charAt(0);
                        break;
                    }

                    else{
                        System.out.print("\n\tInvalid input..");

                        System.out.print("\n\nDo you want to input number again(Y/N) ->  : ");
                        again=scan.next().charAt(0);
                    }


                }
            }
            else if(option==2){
                System.out.println("\n+---------------------------------------+");
                System.out.println("|          Binary Converter             |");
                System.out.println("+---------------------------------------+");
                char again='Y';

                while(again=='Y'){

                    System.out.print("\n\nEnter an Binary number : ");
                    int num=scan.nextInt();

                    int num1,num2=num;
                    int x=0;
                    while(num2!=0){
                        num1=num2%10;
                        if(num1==1 || num1==0 )
                        {
                            //	System.out.println("ok");

                            num2=num2/10;
                        }
                        else{

                            System.out.println("Invalid input...");
                            x++;
                            break;
                        }
                    }
                    int tot=0,count=1;int y=1;
                    int num3,num4=num;
                    if(x==0){

                        while(num4!=0){
                            x++;
                            num3=num4%10;
                            if(num3==1){

                                while(x!=y){
                                    count=count*2;
                                    y++;
                                }
                                tot=tot+count;

                            }else{
                            }
                            num4=num4/10;

                        }

                        System.out.print("\n\tDecimal number: "+tot);
                        String s="";
                        s="";
                        num1=0 ;
                        num2=tot;
                        while(num2!=0){
                            num1=num2%8;
                            s=num1+s;

                            num2=num2/8;
                        }
                        System.out.print("\n\tOctal number: "+s);
                        s="";
                        num1=0 ;
                        num2=tot;
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
                        System.out.print("\n\nDo you want to go to homepage (Y/N) ->  : ");
                        c=scan.next().charAt(0);
                        break;

                    }

                    System.out.print("\n\nDo you want to input number again(Y/N) ->  : ");
                    again=scan.next().charAt(0);
                  //  break;
                }

            }
            else if(option==3){
                System.out.println("\n+---------------------------------------+");
                System.out.println("|           Octal Converter             |");
                System.out.println("+---------------------------------------+");

                char again='Y';
                while(again=='Y'){
                System.out.print("\n\nEnter an Octal number : ");
                int num=scan.nextInt();
                int num1,num2=num,x=1;
                while(num2!=0){
                    num1=num2%10;
                    if(num1<8){
                        num2=num2/10;;
                    }
                    else{
                        x++;
                        break;
                    }
                }
                int  num3,num4=num,num5,num6;
                String s="";
                if(x==1){
                    while(num4!=0){
                        num3=num4%10;
                        num6=num3;
                        if(num6!=0){
                            int y=3;
                            while(num6!=0){
                                num5=num6%2;
                                s=num5+s;
                                 y--;
                                // System.out.print(num5+"");
                                num6=num6/2;


                            }
                            int temp=num4/10;
                            if(y==1){
                                s="0"+s;
                            } else if (y==2) {
                                s="00"+s;
                            }

                        }else{
                            s=s+"000";
                        }
                        num4=num4/10;
                    }
                    int now=Integer.parseInt(s);
                    System.out.print("\n\tBinary number: "+now);
                    int tot=0,count=1;int y=1,z=0;
                    int num7=0,num8=now;


                        while(num8!=0){
                            z++;
                            num7=num8%10;
                            if(num7==1){

                                while(z!=y){
                                    count=count*2;
                                     y++;
                                }
                                tot=tot+count;

                                }
                                else{
                                }

                                num8=num8/10;

                        }

                    System.out.print("\n\tDecimal number: "+tot);

                    s="";
                    num1=0 ;
                    num2=tot;
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
                    System.out.print("\n\nDo you want to go to homepage (Y/N) ->  : ");
                    c=scan.next().charAt(0);
                    break;


            } else{
                    System.out.println("invalid input...");
                    System.out.print("\n\nDo you want to input number again(Y/N) ->  : ");
                    again=scan.next().charAt(0);
                }

            }
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
        }while(c=='Y');

}
    }