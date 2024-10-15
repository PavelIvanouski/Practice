package by.it_academy.practice.practice11;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scanner.nextLine();
        String strTrim = str.trim();
        System.out.println(strTrim);
        String strRep = strTrim.replace('a', '@');
        System.out.println(strRep);
        StringBuffer strBuf = new StringBuffer(strRep);
        strBuf.insert(0, "JAVA");
        System.out.println(strBuf);
        strBuf.reverse();
        System.out.println(strBuf);
        String strUpp = strBuf.toString().toUpperCase();
        System.out.println(strUpp);


    }

}
