package input;


import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);
    public static int inputNumber(){
        int number;
        Boolean check;
        do {
            try {
                number = Integer.parseInt(input.nextLine());
//                check = false;
                break;
            } catch (NumberFormatException exception){
                System.out.println("Sai định dạng nhập lại: ");


            }
        } while (true);

        return number;


    }
    public static String inputString(){
        return input.nextLine();

    }
}
