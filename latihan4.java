import java.util.Scanner;
public class latihan4{
public static void main (String[] args) {
	Scanner masukan = new Scanner(System.in);
	int n1,n2,n3,n4,n5,nmaks,nmin;
	System.out.print("Masukkan Nilai 1 = ");
	n1 = masukan.nextInt();
	System.out.print("Masukkan Nilai 2 = ");
	n2 = masukan.nextInt();
	System.out.print("Masukkan Nilai 3 = ");
	n3 = masukan.nextInt();
	System.out.print("Masukkan Nilai 4 = ");
	n4 = masukan.nextInt();
	System.out.print("Masukkan Nilai 5 = ");
	n5 = masukan.nextInt();
	
	if (n1>n2 && n1>n3 && n1>n4 && n1>n5) {
		nmaks=n1;
	}
	else
	if (n2>n1 && n2>n3 && n2>n4 && n2>n5) {
		nmaks=n2;
	}
	else
	if (n3>n1 && n3>n2 && n3>n4 && n3>n5) {
		nmaks=n3;
	}
	else 
	if (n4>n1 && n4>n2 && n4>n3 && n4>n5) {
		nmaks=n4;
	}
	else {
		nmaks=n5;
	}
	
	if (n1<n2 && n1<n3 && n1<n4 && n1<n5) {
		nmin=n1;
	}
	else
	if (n2<n1 && n2<n3 && n2<n4 && n2<n5) {
		nmin=n2;
	}
	else
	if (n3<n1 && n3<n2 && n3<n4 && n3<n5) {
		nmin=n3;
	}
	else 
	if (n4<n1 && n4<n2 && n4<n3 && n4<n5) {
		nmin=n4;
	}
	else {
		nmin=n5;
	}
	
	System.out.println("Nilai Maks = " +nmaks);
	System.out.println("Nilai Min = " +nmin);
	}
}