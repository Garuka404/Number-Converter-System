import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char c='Y';

        do {

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
                    + "[03] Octal Converter \n\n\t[04] Hexadecimal Converter\n\n\t"
                    + "[05] Roman Number Converter");

            System.out.print("\n\nEnter Option -> ");
            int option = scan.nextInt();


            if (option == 1) {


                System.out.println("\n+---------------------------------------+");
                System.out.println("|          Decimal Converter            |");
                System.out.println("+---------------------------------------+");
                char again = 'Y';

                while (again == 'Y') {
                    String s = "";
                    System.out.print("\n\nEnter an Decimal number : ");
                    int num = scan.nextInt();


                    if (num > 0) {

                        int num1 = 0, num2 = num;
                        while (num2 != 0) {
                            num1 = num2 % 2;
                            s = num1 + s;
                            num2 = num2 / 2;
                        }
                        System.out.print("\n\tBinary number: " + s);
                        s = "";
                        num1 = 0;
                        num2 = num;
                        while (num2 != 0) {
                            num1 = num2 % 8;
                            s = num1 + s;

                            num2 = num2 / 8;
                        }
                        System.out.print("\n\tOctal number: " + s);
                        s = "";
                        num1 = 0;
                        num2 = num;
                        while (num2 != 0) {
                            num1 = num2 % 16;
                            if (num1 >= 10) {
                                if (num1 == 10) {
                                    s = "A" + s;
                                } else if (num1 == 11) {
                                    s = "B" + s;
                                } else if (num1 == 12) {
                                    s = "C" + s;
                                } else if (num1 == 13) {
                                    s = "D" + s;
                                } else if (num1 == 14) {
                                    s = "E" + s;
                                } else {
                                    s = "F" + s;
                                }
                            } else {
                                s = num1 + s;
                            }
                            num2 = num2 / 16;
                        }
                        System.out.print("\n\tHexadecimal number: " + s);
                        //break;

                        // break;
                        System.out.print("\n\nDo you want to go to homepage (Y/N) ->  : ");
                        c = scan.next().charAt(0);
                        break;
                    } else {
                        System.out.print("\n\tInvalid input..");

                        System.out.print("\n\nDo you want to input number again(Y/N) ->  : ");
                        again = scan.next().charAt(0);
                    }


                }
            } else if (option == 2) {
                System.out.println("\n+---------------------------------------+");
                System.out.println("|          Binary Converter             |");
                System.out.println("+---------------------------------------+");
                char again = 'Y';

                while (again == 'Y') {

                    System.out.print("\n\nEnter an Binary number : ");
                    int num = scan.nextInt();

                    int num1, num2 = num;
                    int x = 0;
                    while (num2 != 0) {
                        num1 = num2 % 10;
                        if (num1 == 1 || num1 == 0) {
                            //	System.out.println("ok");

                            num2 = num2 / 10;
                        } else {

                            System.out.println("Invalid input...");
                            x++;
                            break;
                        }
                    }
                    int tot = 0, count = 1;
                    int y = 1;
                    int num3, num4 = num;
                    if (x == 0) {

                        while (num4 != 0) {
                            x++;
                            num3 = num4 % 10;
                            if (num3 == 1) {

                                while (x != y) {
                                    count = count * 2;
                                    y++;
                                }
                                tot = tot + count;

                            } else {
                            }
                            num4 = num4 / 10;

                        }

                        System.out.print("\n\tDecimal number: " + tot);
                        String s = "";
                        s = "";
                        num1 = 0;
                        num2 = tot;
                        while (num2 != 0) {
                            num1 = num2 % 8;
                            s = num1 + s;

                            num2 = num2 / 8;
                        }
                        System.out.print("\n\tOctal number: " + s);
                        s = "";
                        num1 = 0;
                        num2 = tot;
                        while (num2 != 0) {
                            num1 = num2 % 16;
                            if (num1 >= 10) {
                                if (num1 == 10) {
                                    s = "A" + s;
                                } else if (num1 == 11) {
                                    s = "B" + s;
                                } else if (num1 == 12) {
                                    s = "C" + s;
                                } else if (num1 == 13) {
                                    s = "D" + s;
                                } else if (num1 == 14) {
                                    s = "E" + s;
                                } else {
                                    s = "F" + s;
                                }
                            } else {
                                s = num1 + s;
                            }
                            num2 = num2 / 16;
                        }
                        System.out.print("\n\tHexadecimal number: " + s);
                        System.out.print("\n\nDo you want to go to homepage (Y/N) ->  : ");
                        c = scan.next().charAt(0);
                        break;

                    }

                    System.out.print("\n\nDo you want to input number again(Y/N) ->  : ");
                    again = scan.next().charAt(0);
                    //  break;
                }

            } else if (option == 3) {
                System.out.println("\n+---------------------------------------+");
                System.out.println("|           Octal Converter             |");
                System.out.println("+---------------------------------------+");

                char again = 'Y';
                while (again == 'Y') {
                    System.out.print("\n\nEnter an Octal number : ");
                    int num = scan.nextInt();
                    int num1, num2 = num, x = 1;
                    while (num2 != 0) {
                        num1 = num2 % 10;
                        if (num1 < 8) {
                            num2 = num2 / 10;
                            ;
                        } else {
                            x++;
                            break;
                        }
                    }
                    int num3, num4 = num, num5, num6;
                    String s = "";
                    if (x == 1) {
                        while (num4 != 0) {
                            num3 = num4 % 10;
                            num6 = num3;
                            if (num6 != 0) {
                                int y = 3;
                                while (num6 != 0) {
                                    num5 = num6 % 2;
                                    s = num5 + s;
                                    y--;
                                    // System.out.print(num5+"");
                                    num6 = num6 / 2;


                                }
                                int temp = num4 / 10;
                                if (y == 1) {
                                    s = "0" + s;
                                } else if (y == 2) {
                                    s = "00" + s;
                                }

                            } else {
                                s = s + "000";
                            }
                            num4 = num4 / 10;
                        }
                        int now = Integer.parseInt(s);
                        System.out.print("\n\tBinary number: " + now);
                        int tot = 0, count = 1;
                        int y = 1, z = 0;
                        int num7 = 0, num8 = now;


                        while (num8 != 0) {
                            z++;
                            num7 = num8 % 10;
                            if (num7 == 1) {

                                while (z != y) {
                                    count = count * 2;
                                    y++;
                                }
                                tot = tot + count;

                            } else {
                            }

                            num8 = num8 / 10;

                        }

                        System.out.print("\n\tDecimal number: " + tot);

                        s = "";
                        num1 = 0;
                        num2 = tot;
                        while (num2 != 0) {
                            num1 = num2 % 16;
                            if (num1 >= 10) {
                                if (num1 == 10) {
                                    s = "A" + s;
                                } else if (num1 == 11) {
                                    s = "B" + s;
                                } else if (num1 == 12) {
                                    s = "C" + s;
                                } else if (num1 == 13) {
                                    s = "D" + s;
                                } else if (num1 == 14) {
                                    s = "E" + s;
                                } else {
                                    s = "F" + s;
                                }
                            } else {
                                s = num1 + s;
                            }
                            num2 = num2 / 16;
                        }
                        System.out.print("\n\tHexadecimal number: " + s);
                        System.out.print("\n\nDo you want to go to homepage (Y/N) ->  : ");
                        c = scan.next().charAt(0);
                        break;


                    } else {
                        System.out.println("invalid input...");
                        System.out.print("\n\nDo you want to input number again(Y/N) ->  : ");
                        again = scan.next().charAt(0);
                    }

                }
            } else if (option == 4) {
                System.out.println("\n+---------------------------------------+");
                System.out.println("|         Hexadecimal Converter         |");
                System.out.println("+---------------------------------------+");


                char again = 'Y';
                while (again == 'Y') {
                    System.out.print("\n\nEnter an Hexadecimal number : ");
                    String num = scan.next();
                    int l = 0, i = 48, k = 0;
                    String d = "";
                    String p = "";

                    for (int x = 0; x < num.length(); x++) {
                        // System.out.print(num.charAt(x)+" ");
                        // System.out.println("\n\n");
                        char y = num.charAt(x);
                        int z = 0;
                        // System.out.println("char :"+y);
                        // while(true)
                        //  {
                        long numb = (long) y;
                        // System.out.println("num :"+numb);

                        if ((numb >= 48 && numb <= 57)) {
                            i = 48;
                            while (numb != i) {
                                k++;
                                i++;
                            }

                        } else if ((numb >= 65 && numb <= 70)) {
                            i = 65;
                            while (numb != i) {
                                k++;
                                i++;
                            }
                            k += 10;

                        } else if ((numb >= 97 && numb <= 102)) {
                            i = 97;
                            while (numb != i) {
                                k++;
                                i++;
                            }
                            k += 10;

                        } else {
                            break;
                        }
                        d = "";
                        int o = 4;
                        int num1 = 0, num2 = k;
                        while (num2 != 0) {
                            num1 = num2 % 2;
                            d = num1 + d;
                            num2 = num2 / 2;
                            o--;

                        }
                        if (o == 4) {
                            d = "0000" + d;
                        } else if (o == 2) {
                            d = "00" + d;
                        } else if (o == 3) {
                            d = "000" + d;
                        } else if (o == 1) {
                            d = "0" + d;
                        }
                        p = p + d;

                        l++;
                        k = 0;

                    }
                    if (l == num.length()) {

                        int x = 0;

                        int t = p.length(), u = 0;
                        int n = t;
                        long db = 1, tot = 0;

                        for (int m = 0; m < t; m++) {
                            char f = p.charAt(m);

                            if (f == '1') {
                                u = 1;
                                while (u != n) {
                                    db = db * 2;
                                    u++;
                                }

                                tot = tot + db;
                                db = 1;
                                n--;

                            } else {
                                n--;
                            }

                        }
                        System.out.print("\n\tDecimal number: " + tot);
                        System.out.print("\n\tBinary  number: " + p);

                        String s = "";
                        long num1 = 0;
                        long num2 = tot;
                        while (num2 != 0) {
                            num1 = num2 % 8;
                            s = num1 + s;

                            num2 = num2 / 8;
                        }
                        System.out.println("\n\tOctal number: " + s);
                        System.out.print("\n\nDo you want to go to homepage (Y/N) ->  : ");
                        c = scan.next().charAt(0);
                        break;

                    } else {
                        System.out.println("invalid input...");
                        System.out.print("\n\nDo you want to input number again(Y/N) ->  : ");
                        again = scan.next().charAt(0);

                    }
                }


        }
        else if(option==5){
                System.out.println("\n+---------------------------------------+");
                System.out.println("|         Roman Number Converter        |");
                System.out.println("+---------------------------------------+");
                    System.out.println("\n\t\t[01] Decimal Number to Roman Number Converter");
                    System.out.println("\n\t\t[01] Roman Number to Decimal Number Converter");
                    System.out.print("\n\nEnter Option -> ");
                    int option2 = scan.nextInt();
                  char again = 'Y';
                while (again == 'Y') {
                    if (option2 == 1) {
                        System.out.println("\n+-------------------------------------------------------+");
                        System.out.println("|        Decimal Number to Roman Number Converter       |");
                        System.out.println("+-------------------------------------------------------+");

                        int num3;
                        int num4, num5 = 0, num6;


                        System.out.print("\nEnter the number :");
                        int num = scan.nextInt();
                        if (num > 0) {
                            int num2 = num;

                            // while(num2!=0){
                            if (num2 >= 100) {
                                num5 = num2 / 100;
                                for (int r = 0; r < num5; r++) {
                                    if (num5 == 4) {
                                        System.out.print("CD");
                                        break;
                                    }
                                    if (num5 >= 5) {
                                        if (num5 < 9) {
                                            System.out.print("D");
                                            int e = num2 - 500;
                                            e = e / 100;
                                            for (int f = 0; f < e; f++) {
                                                System.out.print("C");
                                            }
                                        } else {
                                            if (num2 == 1000) {
                                                System.out.print("M");
                                            } else {
                                                System.out.print("CM");
                                            }

                                        }
                                        break;
                                    }
                                    System.out.print("C");
                                }

                                num2 = num % 100;
                            }
                            if (num2 < 100) {


                                num5 = num2 / 10;
                                for (int z = 0; z < num5; z++) {
                                    if (num5 == 4) {
                                        System.out.print("XL");
                                        break;
                                    }
                                    if (num5 >= 5) {
                                        if (num5 < 9) {
                                            System.out.print("L");
                                            if (num2 / 60 > 0 && num % 60 <= 29) {
                                                int t = num2 - 50;
                                                t = t / 10;
                                                for (int f = 0; f < t; f++) {
                                                    System.out.print("X");
                                                }
                                            }
                                        } else {
                                            System.out.print("XC");
                                        }

                                        break;
                                    } else {
                                        System.out.print("X");
                                    }


                                }
                                num5 = num2 % 10;
                                //  break;
                                //  }

                                for (int x = 0; x < num5; x++) {

                                    num3 = num5 / 5;
                                    num4 = num5 % 5;

                                    num2 = num4;
                                    if (num5 == 5 || (num5 > 5 && num5 < 9)) {
                                        System.out.print("V");

                                    }
                                    if (num5 == 10) {
                                        System.out.print("X");

                                    }
                                    if (num5 == 4) {

                                        System.out.print("IV");

                                    }
                                    if (num5 == 9) {
                                        System.out.print("IX");

                                    }
                                    if (num2 < 4) {
                                        for (x = 0; x < num2; x++) {

                                            System.out.print("I");
                                        }

                                    }
                                    if (num3 > 1 && num4 < 4) {
                                        for (x = 0; x < num3; x++) {

                                            System.out.print("V");
                                        }
                                        for (x = 0; x < num4; x++) {

                                            System.out.print("I");
                                        }

                                    }

                                    break;
                                }

                            }
                            System.out.print("\n\nDo you want to go to homepage (Y/N) ->  : ");
                            c = scan.next().charAt(0);
                            break;
                        } else {
                            System.out.println("invalid input...");
                            System.out.print("\n\nDo you want to input number again(Y/N) ->  : ");
                            again = scan.next().charAt(0);
                        }

                    } else if (option2 == 2) {

                    } else {

                        System.out.println("invalid input...");

                    }
                }
            }
        else{
            System.out.print("Invalid number try again!!!!!");


        }
        }while(c=='Y');

}
    }