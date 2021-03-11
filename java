package woow1;
import java.util.Scanner;
public class woow {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3,num4, max;
		System.out.print("請輸入四個數字(空白區隔):");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		num4 = scn.nextInt();
		if ( num1 > num2) {        // 用巢狀迴圈來判四個數字中，誰是最大數字
		if ( num1 > num3) 
	    if ( num1 > num4)
			max = num1;
		    else
			max = num4;
		    else
			max = num3;
		}
            else 
			{
			if ( num2 > num3)
			if ( num2 > num4)
				max = num2;
			else
				max = num3;
			else
				max = num4;
		   } 	   
		System.out.println("最大的數字是:"+ max);
        scn.close();
        }
}
