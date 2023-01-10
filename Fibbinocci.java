package week1.day1;

public class Fibbinocci {
	static int firstSum=0,secondSum=1,sum=0;    
	static void printFibonacci(int count){    
		if(count>0)
		{    
			sum = firstSum + secondSum;    
			firstSum = secondSum;    
			secondSum = sum;    
			System.out.print(" "+sum);   
			printFibonacci(count-1);    
		}    
	}    

	public static void main(String args[]){    
		int count=13;    
		System.out.print(firstSum+" "+secondSum);//printing 0 and 1    
		printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	}  
}  
