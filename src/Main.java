import java.math.BigInteger;
import java.util.Scanner;

//Copyright 2022 by ou
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter some number:");
        String collatz = scanner.next();

        cacl(collatz);
    }

    public static void cacl(String collatz){
        if (!checkString(collatz)){
            System.out.println("This is not a number");
            return;
        }
        BigInteger a = new BigInteger (collatz);
        while (a.compareTo(BigInteger.ONE)>0){
            if (a.remainder(BigInteger.TWO)==BigInteger.ONE){
                a=a.multiply(new BigInteger("3")).add(BigInteger.ONE);
            }else {
                a=a.divide(BigInteger.TWO);
            }
            System.out.println(a);
        }
    }
    public static boolean checkString(String text) {

        boolean res = true;

        // 受け取った文字列を先頭から1文字ずつチェックする
        for(int i = 0; i < text.length(); i++) {

            // もし数値だったら次の処理へ
            if(Character.isDigit(text.charAt(i))) {
                continue;
            } else {
                // 変数にfalseを代入して処理を終了する
                res =  false;
                break;
            }
        }

        return res;
    }
}