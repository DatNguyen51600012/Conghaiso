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

        String result = "";   // chu?i ch?a k?t qu?
        
        String stepMsg = "";   // chu?i ch?a các b??c trong quá trình c?ng

        int temp = 0;   // bi?n tính t?ng
        
        int temp2 = 0;  // bi?n l?y hàng ??n v?
        int carry = 0;  // bi?n nh?
        int i = 0;      // bi?n ??m

        int length1 = s1.length();   // bi?n ch?a ?? dài chu?i 1
        int length2 = s2.length();   // bi?n ch?a ?? dài chu?i 2
        
        int n1 = 0;     // bi?n ch?a s? trong chu?i 1
        int n2 = 0;     // bi?n ch?a s? trong chu?i 2


        char checkS1;     // bi?n ki?m tra 
        char checkS2;     // bi?n ki?m tra 

        int length = length1 < length2 ? length2 : length1; // L?y  bi?n ch?a ?? dài l?n nh?t trong 2 chu?i s1, s2

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

            temp = n2 + n1 + carry; // tính t?ng
            temp2 = temp % 10;  // l?y hàng ??n v?

            if (carry == 0) {
                stepMsg += "\n" + "Buoc " + (i + 1) + ": "  + "lay " + n1 + ", cong " + n2 + ", bang " + temp + ", viet " + temp2 + ", nho " + temp / 10 + "\n"; // g?i thông báo t?ng b??c c?ng
            } else {
                stepMsg += "\n" + "Buoc " + (i + 1) + ": " + "lay " + n1 + ", cong " + n2 + ", nho " + carry + ", bang " + temp + ", viet " + temp2 + ", nho " + carry + "\n"; // g?i thông báo t?ng b??c c?ng
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
}
