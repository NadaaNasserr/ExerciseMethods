import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //   smallest();
        //check();
        validPassword();

    }


//    public static void smallest(){
//        Scanner S = new  Scanner(System.in);
//        System.out.println("Input the first number:");
//        int num1 =S.nextInt();
//        System.out.println("Input the Second number:");
//        int num2 =S.nextInt();
//        System.out.println("Input the third number:");
//        int num3 =S.nextInt();
//         if ( num1 < num2 && num1 < num3){
//            System.out.println("The smallest value is" + num1);
//        } else if ( num2 < num1 && num2 < num3) {
//            System.out.println("The smallest value is" + num2);
//        } else  System.out.println("The smallest value is " + num3);
//    }


//    public static void check(){
//        Scanner S = new  Scanner(System.in);
//        System.out.println("Input any number:");
//        int num =S.nextInt();
//
//        if(num > 0){
//            System.out.println("the number is positive");
//        }
//        else if(num < 0){
//            System.out.println("the number is negative");
//        }
//        else System.out.println("the number is zero");
//
//    }

    public static void validPassword() {
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits");

        Scanner S = new Scanner(System.in);
        System.out.println("Input a password");
        String password = S.next();


        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);
            char d = password.charAt(i);
            int count = 0;

            if ('0' <= d && d <= '9') {
                System.out.println("number:-" + d);
                count++;
            }
            if(password.length()>= 8 && password.contains("1234567890") && count <=2){
                System.out.println("Password is valid:"  + password);
            }
              else System.out.println("Password  invalid:"  + password);
        }
    }
}


