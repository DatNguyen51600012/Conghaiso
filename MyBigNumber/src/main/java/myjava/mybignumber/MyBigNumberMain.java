
/**
 Author : Nguyen Thanh Dat 
 MSSV 51600012
 Class(file) MyBigNumber để cộng hai số
 Edited : 21/12/2018 

 hàm main

* */
import java.util.Scanner;

public class MyBigNumberMain implements IReceiver{


    /*
     * Hàm main nhập 
     * 
     * */

    /**
     *
     * @param args s1
     * @param args s2
     */

    
    public static void main(String[] args) {

        boolean success = false;

        Scanner sc = new Scanner(System.in);
        MyBigNumberMain main = new MyBigNumberMain();
        MyBigNumber s = new MyBigNumber(main);

        
        while (!success) {
            try {
                String input = sc.nextLine();

                String[]split = input.split(" ");

                String result = s.sum(split[1], split[2]);
                System.out.println("Ket qua : " + result + "\n");

                success = true;
            } catch (NumberFormatException e) {
                System.out.println("\n" + e.getMessage() + "\n");
            }
        }

        sc.close();

    }

    /* 
     *Hàm gửi thông báo 
    */
    
    
    
    public void sendMessage(String str) {
        System.out.println(str);
    }

}
