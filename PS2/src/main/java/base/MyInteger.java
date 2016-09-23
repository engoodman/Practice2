package base;


public class MyInteger{
	private int iValue;

	public MyInteger(int i){
		iValue = i;
	}
	
	public int getiValue(){
		return iValue; 
	}
	
private boolean isEven(int MyInteger){
	return (iValue%2) == 0;
}
private boolean isOdd(int MyInteger){
	return (iValue%2) == 0;
}
private boolean isPrime(int MyInteger){
	for ( int i = 2; i < iValue; i++){
		if ( i%iValue == 0){
			return false;
		}
	}
	return true;
	

}


public static boolean isEven(MyInteger MyInteger){
	return base.MyInteger.isEven(MyInteger);
}
public static boolean isOdd(MyInteger MyInteger){
	return base.MyInteger.isOdd(MyInteger);
}
public static boolean isPrime(MyInteger MyInteger){
	return base.MyInteger.isPrime(MyInteger);
}
public boolean equals(){
	return iValue == iValue;
}
public static boolean equals(MyInteger MyInteger){
	return base.MyInteger.equals(MyInteger);
}

}


			

		

	
	
		

	



