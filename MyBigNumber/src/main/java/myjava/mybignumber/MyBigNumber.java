/**
 Author : Nguyen Thanh Dat 
 MSSV 51600012
 Class(file) MyBigNumber use to add two number
 Edited : 21/12/2018 
 */
 
public class MyBigNumber {

    private IReceiver receiver;

    public MyBigNumber(){}

    public MyBigNumber(final IReceiver receiver) {
        this.receiver = receiver;
    }


    /**
     *  Ham cong hai so .
     */

    public String sum(final String s1, final String s2) {

        if (s1.contains("-")) {
            throw new NumberFormatException("So thu nhat phai la so nguyen duong"); // bat loi khong phai so nguyen duong
        } 

        if (s2.contains("-")) {
            throw new NumberFormatException("So thu nhi phai la so nguyen duong"); // bat loi khong phai so nguyen duong
        }

        String result = "";   // chuoi chua ket qua
        
        String stepMsg = "";   // chuoi chua cac buoc trong qua trinh cong

        int temp = 0;   // bien tinh tong
        
        int temp2 = 0;  // bien lay hang don vi
        int carry = 0;  // bien nho
        int i = 0;      

        int length1 = s1.length();   // bien chua do dai chuoi 1
        int length2 = s2.length();   // bien chua do dai chuoi 2
        
        int n1 = 0;     // bien chua so trong chuoi 1
        int n2 = 0;     // bien chua so trong chuoi 2


        char checkS1;     // bien kiem tra 
        char checkS2;     // bien kiem tra 

        int length = length1 < length2 ? length2 : length1; // lay bien co do dai lon nhat

        for (i = 0; i < length; i++) {

            checkS1 = i < length1 ? s1.charAt(i) : '0'; 
            checkS2 = i < length2 ? s2.charAt(i) : '0';

            if (!(checkS1 >= '0' && checkS1 <= '9')) {
                throw new NumberFormatException("Vi tri thu " + (s1.indexOf(checkS1) + 1) + " cua so thu 1 khong phai la so");
            }

            if (!(checkS2 >= '0' && checkS2 <= '9')) {
                throw new NumberFormatException("Vi tri thu " + (s2.indexOf(checkS1) + 1) + " cua so thu 2 khong phai la so");
            }

            n1 = i < length1 ? (s1.charAt(length1 - i - 1) - '0') : 0;
            n2 = i < length2 ? (s2.charAt(length2 - i - 1) - '0') : 0;

            temp = n2 + n1 + carry; // tinh tong
            temp2 = temp % 10;  

            if (carry == 0) {
                stepMsg += "\n" + "Buoc " + (i + 1) + ": "  + "lay " + n1 + ", cong " + n2 + ", bang " + temp + ", viet " + temp2 + ", nho " + temp / 10 + "\n"; // gui thong bao tang buoc cong
            } else {
                stepMsg += "\n" + "Buoc " + (i + 1) + ": " + "lay " + n1 + ", cong " + n2 + ", nho " + carry + ", bang " + temp + ", viet " + temp2 + ", nho " + carry + "\n"; // gui thong bao tang buoc cong
            }

            carry = temp / 10;
            result = temp2 + result;

        }

        if (carry > 0) {
            result = result + carry;
            stepMsg += "\n" + "Buoc " + (i + 1) + ": " + "lay " + 0 + ", cong " + 0 + ", nho " + 1 + ", bang " + 1 + ", viet " + 1 + "\n";
        }


        receiver.sendMessage(stepMsg);

        return result;

    }

    String getS1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}