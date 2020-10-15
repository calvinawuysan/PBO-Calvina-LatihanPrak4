import java.util.Scanner;
public class latihan5{
public static void main (String[] args) {
	Scanner masukan = new Scanner(System.in);
	int nilai;
	System.out.print("Masukkan Nilai = ");
	nilai = masukan.nextInt();
	
	if (nilai>0) {
		System.out.println("Nilai "+nilai+" merupakan nilai positif");
	}
	else {
		System.out.println("Nilai "+nilai+" merupakan nilai negatif");
	}
	}
}