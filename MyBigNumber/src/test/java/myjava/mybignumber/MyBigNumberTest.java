package myjava.mybignumber;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

    /**
     * Tác giả : Nguyễn Thành Đạt
	 * MSSV 51600012
	 * MyBigNumberTest class để cộng hai số
     * */

public class MyBigNumberTest implements IReceiver {

	public static int i = 0;
	public static ArrayList<String> listcase = new ArrayList<String>();
	
	@Test
	void testSum_case1() { //Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là nhỏ
		try {
			listcase.add("Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là nhỏ");
		    MyBigNumberTest myclass = new MyBigNumberTest();
		    MyBigNumber mybignumber = new MyBigNumber(myclass);
		    String sum = mybignumber.sum("123", "987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case2() { //Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là lớn
		try {
			listcase.add("Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là lớn");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("144232424234", "987242342432");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case3() { //Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là nhỏ
		try {
			listcase.add("Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là nhỏ");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("12", "987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case4() { //Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là lớn
		try {
			listcase.add("Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là lớn");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("122342", "983424324234242427");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case5() { //Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là nhỏ
		try {
			listcase.add("Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là nhỏ");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123", "98");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case6() { //Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là lớn
		try {
			listcase.add("Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là lớn");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("12331313123123213", "9843434334");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case7() { //Trường hợp có chứa 1 kí tự ở chuỗi 1
		try {
			listcase.add("Trường hợp có chứa 1 kí tự ở chuỗi 1");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123A", "987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case8() { //Trường hợp có chứa 1 kí tự ở chuỗi 2
		try {
			listcase.add("Trường hợp có chứa 1 kí tự ở chuỗi 2");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123", "987B");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case9() { //Trường hợp có chứa nhiều kí tự ở chuỗi 1
		try {
			listcase.add("Trường hợp có chứa nhiều kí tự ở chuỗi 1");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123Adanvbd", "987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case10() { //Trường hợp có chứa nhiều kí tự ở chuỗi 2
		try {
			listcase.add("Trường hợp có chứa nhiều kí tự ở chuỗi 2");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123", "987dbvmcjhd");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case11() { //Trường hợp có chứa 1 kí tự ở cả 2 chuỗi
		try {
			listcase.add("Trường hợp có chứa 1 kí tự ở cả 2 chuỗi");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123A", "c987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case12() { //Trường hợp có chứa nhiều kí tự ở cả 2 chuỗi
		try {
			listcase.add("Trường hợp có chứa nhiều kí tự ở cả 2 chuỗi");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("sadasd123A", "sd987sdsdsd");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case13() { //Trường hợp có chứa 1 kí tự đặc biệt ở chuỗi 1
		try {
			listcase.add("Trường hợp có chứa 1 kí tự đặc biệt ở chuỗi 1");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123&", "987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case14() { //Trường hợp có chứa 1 kí tự đặc biệt ở chuỗi 2
		try {
			listcase.add("Trường hợp có chứa 1 kí tự đặc biệt ở chuỗi 2");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123", "#987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case15() { //Trường hợp có chứa nhiều kí tự đặc biệt ở chuỗi 1
		try {
			listcase.add("Trường hợp có chứa nhiều kí tự đặc biệt ở chuỗi 1");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("$$$123&", "987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case16() { //Trường hợp có chứa nhiều kí tự đặc biệt ở chuỗi 2
		try {
			listcase.add("Trường hợp có chứa nhiều kí tự đặc biệt ở chuỗi 2");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123", "$%%987#");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case17() { //Trường hợp có chứa 1 kí tự đặc biệt ở cả 2 chuỗi
		try {
			listcase.add("Trường hợp có chứa 1 kí tự đặc biệt ở cả 2 chuỗi");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123&", "#987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case18() { //Trường hợp có chứa nhiều kí tự đặc biệt ở cả 2 chuỗi
		try {
			listcase.add("Trường hợp có chứa 1 kí tự đặc biệt ở cả 2 chuỗi");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("**&&123&", "987((&^");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case19() { //Trường hợp có chứa số âm ở chuỗi 1
		try {
			listcase.add("Trường hợp có chứa số âm ở chuỗi 1");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("-123", "987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case20() { //Trường hợp có chứa số âm ở chuỗi 2
		try {
			listcase.add("Trường hợp có chứa số âm ở chuỗi 1");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("123", "-987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case21() { //Trường hợp có chứa số âm ở cả 2 chuỗi
		try {
			listcase.add("Trường hợp có chứa số âm ở cả 2 chuỗi");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("-123", "-987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case22() { //Trường hợp có chuỗi 1 toàn chữ cộng với chuỗi 2 toàn số
		try {
			listcase.add("Trường hợp có chuỗi 1 toàn chữ cộng với chuỗi 2 toàn số");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("SADKJSsfds", "234987");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case23() { //Trường hợp có chuỗi 2 toàn chữ cộng với chuỗi 1 toàn số
		try {
			listcase.add("Trường hợp có chuỗi 1 toàn chữ cộng với chuỗi 2 toàn số");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("2424242", "nghksuhfss");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case24() { //Trường hợp cả chuỗi toàn chữ cộng với nhau
		try {
			listcase.add("Trường hợp cả chuỗi toàn chữ cộng với nhau");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("ffdsfdsfs", "nghksuhfss");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case25() { //Trường hợp có chuỗi 1 toàn kí tự đặc biệt cộng với chuỗi 2 toàn số
		try {
			listcase.add("Trường hợp có chuỗi 1 toàn kí tự đặc biệt cộng với chuỗi 2 toàn số");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("^$$^#", "43543543");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	@Test
	void testSum_case26() { //Trường hợp có chuỗi 2 toàn kí tự đặc biệt cộng với chuỗi 1 toàn số
		try {
			listcase.add("Trường hợp có chuỗi 2 toàn kí tự đặc biệt cộng với chuỗi 1 toàn số");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("24324234", "^#%$#%#$");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case27() { //Trường hợp cả chuỗi 2 toàn kí tự đặc biệt cộng với nhau
		try {
			listcase.add("Trường hợp có chuỗi 2 toàn kí tự đặc biệt cộng với chuỗi 1 toàn số");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("%$^%$#", "^#%$#%#$");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case28() { //Trường hợp có chuỗi 1 có chứa chữ cộng với chuỗi 2 là số âm
		try {
			listcase.add("Trường hợp có chuỗi 1 có chứa chữ cộng với chuỗi 2 là số âm");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("ds7774", "-12121");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case29() { //Trường hợp có chuỗi 2 có chứa chữ cộng với chuỗi 1 là số âm
		try {
			listcase.add("Trường hợp có chuỗi 2 có chứa chữ cộng với chuỗi 1 là số âm");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("-4232", "h7756");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case30() { //Trường hợp cả chuỗi đều có chứa chữ và là số âm cộng với nhau
		try {
			listcase.add("Trường hợp cả chuỗi đều có chứa chữ và là số âm cộng với nhau");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("-42d32", "-h7756");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case31() { //Trường hợp có chuỗi 1 có chứa kí tự đặc biệt cộng với chuỗi 2 là số âm
		try {
			listcase.add("Trường hợp có chuỗi 1 có chứa kí tự đặc biệt cộng với chuỗi 2 là số âm");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("*^7774", "-12121");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case32() { //Trường hợp có chuỗi 2 có chứa kí tự đặc biệt cộng với chuỗi 1 là số âm
		try {
			listcase.add("Trường hợp có chuỗi 2 có chứa kí tự đặc biệt cộng với chuỗi 1 là số âm");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("-4232", "*^7756");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case33() { //Trường hợp cả chuỗi đều có chứa kí tự đặc biệt và là số âm cộng với nhau
		try {
			listcase.add("Trường hợp cả chuỗi đều có chứa chữ và là số âm cộng với nhau");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("-42^$%32", "-#7756");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case34() { //Trường hợp có chuỗi 1 có chứa kí tự đặc biệt cộng với chuỗi 2 có chứa chữ 
		try {
			listcase.add("Trường hợp có chuỗi 1 có chứa kí tự đặc biệt cộng với chuỗi 2 có chứa chữ ");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("*^7774", "d12121");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case35() { //Trường hợp có chuỗi 2 có chứa kí tự đặc biệt cộng với chuỗi 1 có chứa chữ 
		try {
			listcase.add("Trường hợp có chuỗi 2 có chứa kí tự đặc biệt cộng với chuỗi 1 có chứa chữ ");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("d4232", "*^7756");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case36() { //Trường hợp cả chuỗi đều có chứa kí tự đặc biệt và chữ cộng với nhau
		try {
			listcase.add("Trường hợp cả chuỗi đều có chứa chữ và là số âm cộng với nhau");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("ds42^$%32", "s#7756");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case37() { //Trường hợp có chuỗi 1 có chứa kí tự đặc biệt và là số âm cộng với chuỗi 2 có chứa chữ
		try {
			listcase.add("Trường hợp có chuỗi 1 có chứa kí tự đặc biệt cộng với chuỗi 2 có chứa chữ ");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("-*^7774", "d12121");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case38() { //Trường hợp có chuỗi 2 có chứa kí tự đặc biệt cộng với chuỗi 1 có chứa chữ và là số âm
		try {
			listcase.add("Trường hợp có chuỗi 2 có chứa kí tự đặc biệt cộng với chuỗi 1 có chứa chữ ");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("d4232", "-*^7756");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Test
	void testSum_case39() { //Trường hợp cả chuỗi đều có chứa kí tự đặc biệt và chữ cộng và là đều là số âm với nhau
		try {
			listcase.add("Trường hợp cả chuỗi đều có chứa chữ và là số âm cộng với nhau");
			MyBigNumberTest myclass = new MyBigNumberTest();
			MyBigNumber mybignumber = new MyBigNumber(myclass);
			String sum = mybignumber.sum("-ds42^$%32", "-s#7756");
		}catch(NumberFormatException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
	    System.out.println("Case: " + (i+1) + " - " + listcase.get(i) + "\n" + msg);
		System.out.println("\n\n");
		i++;
	}
}
