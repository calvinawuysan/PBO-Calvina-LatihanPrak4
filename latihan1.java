import java.io.*;
public class latihan1{
public static void main (String[] args) {
	char hurufawal = 'a';
	System.out.print("Masukkan huruf awal nama anda = ");
	try {
		hurufawal = (char)System.in.read();
	}catch(Exception e){
		System.out.println("Salah ko menginput cess!!!");	
	}
	if (hurufawal == 'a')
	System.out.println("apa namamu amin?");
	else if (hurufawal == 'b')
	System.out.println("apa namamu bambang?");
	else if (hurufawal == 'c')
	System.out.println("apa namamu ceceo?");
	else if (hurufawal == 'd')
	System.out.println("apa namamu daud?");
	else if (hurufawal == 'e')
	System.out.println("apa namamu endang?");
	else
	System.out.println("aku tidak bisa menebak");
	}
}