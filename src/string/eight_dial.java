package string;

import java.util.Scanner;

public class eight_dial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int time = 0;		// 걸리는 시간 변수 선언
		
		for(int i=0; i<str.length(); i++) {		// 문자열의 길이만큼 for문을 돌린다. 
			if(str.charAt(i)=='A' || str.charAt(i)=='B' || str.charAt(i)=='C') {
				time += 3;
			}
			else if(str.charAt(i)=='D' || str.charAt(i)=='E' || str.charAt(i)=='F') {
				time+= 4;
			}
			else if(str.charAt(i)=='G' || str.charAt(i)=='H' || str.charAt(i)=='I') {
				time+= 5;
			}
			else if(str.charAt(i)=='J' || str.charAt(i)=='K' || str.charAt(i)=='L') {
				time+= 6;
			}
			else if(str.charAt(i)=='M' || str.charAt(i)=='N' || str.charAt(i)=='O') {
				time+= 7;
			}
			else if(str.charAt(i)=='P' || str.charAt(i)=='Q' || str.charAt(i)=='R' ||str.charAt(i)=='S') {
				time+= 8;
			}
			else if(str.charAt(i)=='T' || str.charAt(i)=='U' || str.charAt(i)=='V') {
				time+= 9;
			}
			else if(str.charAt(i)=='W' || str.charAt(i)=='X' || str.charAt(i)=='Y' || str.charAt(i)=='Z') {
				time+= 10;
			}
		} // for
		System.out.println(time);
	} // main

}
