import java.util.Scanner;
public class IntToEng {
    // 繝｡繧､繝ｳ繝｡繧ｽ繝�繝�
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 謨ｰ蛟､繧定恭險ｳ縺吶ｋ螟画鋤縺吶ｋ繝｡繧ｽ繝�繝�
    static String translateEng(int n) {
    	String x = "";
    	int val = String.valueOf( n ).length();
    	if (val < 2) {
    		x = hitoketa(n);
    		//!
    	}
    	else if (val == 2) {
    		int	a = n/10;
    		int b = n%10;
    		
    		if (a == 1) {
    			if (n == 10) x = "ten";
    			if (n == 11) x = "eleven";
    			if (n == 12) x = "twelve";
    			if (n == 13) x = "thirteen";
    			if (n == 14) x = "fourteen";
    			if (n == 15) x = "fifteen";
    			if (n == 16) x = "sixteen";
    			if (n == 17) x = "seventeen";
    			if (n == 18) x = "eighteen";
    			if (n == 19) x = "nineteen";
    		} else {
    			if (b == 0) {
    				x = hutaketa(a);
    			} else {
    				x = hutaketa(a) + " " + hitoketa(b);
    			}
    		}
    	}
    	else if (val ==3) {
    		int c = n/100;
    		x = sanketa(c) + " " + hutaketa(a) + " " + hitoketa(b);
    	}
        return x;
    }
    
    static String hitoketa(int n) {
    	String x = null;
    	if (n == 0) x = "zero";
    	if (n == 1) x = "one";
		if (n == 2) x = "two";
		if (n == 3) x = "three";
		if (n == 4) x = "four";
		if (n == 5) x = "five";
		if (n == 6) x = "six";
		if (n == 7) x = "seven";
		if (n == 8) x = "eight";
		if (n == 9) x = "nine";
		return x;
    }
    
    static String hutaketa(int n) {
    	String x = null;
    	if (n == 2) x = "twenty";
    	if (n == 3) x = "thirty";
    	if (n == 4) x = "fourty";
    	if (n == 5) x = "fifty";
    	if (n == 6) x = "sixty";
    	if (n == 7) x = "seventy";
    	if (n == 8) x = "eighty";
    	if (n == 9) x = "ninety";
    	return x;
    }
    
    static String sanketa(int n) {
    	String x =null;
    	if(n==1) x = "one hundred ";
    	else x = hitoketa(n) + "hundreds"
    	return x;
    }
    
}
