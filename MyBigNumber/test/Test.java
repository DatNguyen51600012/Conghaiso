/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 Author : Nguyen Thanh Dat 
// MSSV 51600012
// Class(file) MyBigNumber use to add two number
// Edited : 25/10/2018 
*/


    
public class Test{

    MyBigNumber myBigNumber =  new MyBigNumber();

    
    public void test1() {
        try {
            String s = myBigNumber.sum("123", "456");
            assertEquals("579", s);
        } catch (NullPointerException e) {}
    }

    
    public void test2(){
        try {
            String s = myBigNumber.sum("1235", "856");
            assertEquals("2091", s);
        } catch (NullPointerException e) {}
    }

    
    public void test3(){
        try {
            String s = myBigNumber.sum("100", "900");
            assertEquals("1000", s);
        } catch (NullPointerException e) {}
    }

   
    public void test4(){
        try {
            String s = myBigNumber.sum("999", "111");
            assertEquals("1110", s);
        } catch (NullPointerException e) {}
    }

    
    public void test5(){
        try {
            String s = myBigNumber.sum("999", "1111");
            assertEquals("2110", s);
        } catch (NullPointerException e) {}
    }

    
    public void test6(){
        try {
            String s = myBigNumber.sum("1234567890", "4");
            assertEquals("1234567894", s);
        } catch (NullPointerException e) {}
    }

   
    public void test7(){
        try {
            String s = myBigNumber.sum("abssa", "4");
        } catch (NullPointerException e) {}
    }

    
    public void test8(){
        try {
            String s = myBigNumber.sum("-7", "7");
        } catch (NullPointerException e) {}
    }

    
    public void test9(){
        try {
            String s = myBigNumber.sum("9", "4asasd");
        } catch (NullPointerException e) {}
    }

    
    public void test10(){
        try {
            String s = myBigNumber.sum("8", "-77");
        } catch (NullPointerException e) {}
    }

    
    public void test11(){
        try {
            String s = myBigNumber.sum("5", "-7asdasag");
        } catch (NullPointerException e) {}
    }

    
    public void test12(){
        MyBigNumberMain test = new MyBigNumberMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("3", "-7asdg");
    }

        private void assertEquals(String string, String s) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }


}

