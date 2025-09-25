package handson;

public class ouputfromatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
String b = "Bagya";
//System.out.printf("%d%n",a);
//System.out.printf("%s%n",b);
//System.out.printf("%5s%n",b);
//System.out.printf("%-5s",b);
double f = 10.35;
//System.out.printf("%f%n",f);//10.350000
//System.out.printf("%.2f%n",f);//10.35
//System.out.printf("you have %-1f%n",f);//you have 10.350000
//System.out.printf("you have %+3f%n",f);//you have +10.350000
System.out.printf("you have %020f%n",f);//you have 0000000000010.350000
double d = 100000;
System.out.printf("you have %,f%n",d);//you have 100,000.000000
	}

}
