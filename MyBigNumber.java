/**
 *
 * @author Nguyen Van Hai
 */
import java.util.*;

public class MyBigNumber {
 
    /**
     * @param args the command line arguments
     */
 
    //reverses the string
    public static String reverses(String str){
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }
    
    //This function which we can find the sum of two string number
    public static String sum(String num1, String num2){
        if(num1.length() < num2.length()){                                //kiem tra va hoan doi giua num1 va num2 (de lay chuoi num1 la co do dai lon nhat)                     
				String temp = num1;
                num1 = num2;
                num2 = temp;
        }
        System.out.println("num1 = " + num1 +"\t" + "num2 = " + num2);
        int lenOfNum1 = num1.length(), lenOfNum2 = num2.length();          // 2 bien nay la lay do dai cua hai chuoi so    
        
        String newNum1 = reverses(num1);                                    // chuoi so num1 sau khi dao nguoc chuoi
        String newNum2 = reverses(num2);                                    //chuoi so num2 sau khi dao nguoc chuoi
 
        int carry = 0, sum = 0;                                             //carry la bien nho, sum la bien chua gia tri tong
		String result = "";                                                 // chuoi chua gia tri tong cua 2 chuoi so
		
        for(int i = 0; i < lenOfNum2; i++){
            sum = (newNum1.charAt(i) - '0') + (newNum2.charAt(i) - '0');    //cong 2 so sau khi chuyen 2 chuoi so thanh ma ascii

			if(carry != 0) sum += carry;                                    // kiem tra neu co nho thi cong them 
			carry = 0;                     								    // khoi tai lai bien nho sau khi da cong
			if(sum > 9){												    // truong hop tong lon hon 9 thi tach tong thanh 2 ben trai va ben phai
				carry = sum/10;											    // lay gia tri ben trai cua bien tong
				sum = sum%10; 										        // lay gia tri ben phai cua bien tong
			}
			result += ("" + sum);									        // add gia tri tong vao chuoi ket qua
        }
        if(lenOfNum1 != lenOfNum2){                                         //kiem tra neu 2 chuoi co do dai la khac nhau
			for(int j = lenOfNum2; j < lenOfNum1; j++){                     // vong lap nay de add cac so con lai cua num1 vao chuoi ket qua
				if(carry != 0) result += ("" + newNum1.charAt(j) + carry);  //kiem tra neu bien nho con sau khi cong o vong lap tren con thi cong vao so tiep theo cua so trong chuoi num1 va add vao chuoi ket qua
				else result +=("" + newNum1.charAt(j));					    //nguoc lai add lan luoc cac so con lai cua chuoi num1 vao chuoi ket qua
			}
		}
		return reverses(result);											// return chuoi ket qua sau khi da dao nguoc lai chuoi
    }
	
    public static void main(String[] args) {
        // TODO code application logic here
        //String result = sum("111111111", "12411");
		//System.out.println(result + "\t this is answer.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string number: ");
		String num1 = sc.nextLine();
		System.out.println("Enter the second string number: ");
		String num2 = sc.nextLine();
		System.out.println("Sum of two string number is: " + sum(num1, num2));
    }
}