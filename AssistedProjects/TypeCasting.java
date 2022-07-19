package AssistedProjects;

public class TypeCasting {


public static void main(String args[]) {
	//Implicit TypeCasting
 byte a=4;
  short b=a;
  int c=b;
  long d=c;
  float e=d;
  double f=e;
  
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);


//Explicit typeCasting
double g=50.8;
float h= (float)g;
long i=(long)h;
int j=(int)i;
short k=(short)j;
byte l=(byte)k;

System.out.println(h);
System.out.println(i);
System.out.println(j);
System.out.println(k);
System.out.println(l);
	
}
}


