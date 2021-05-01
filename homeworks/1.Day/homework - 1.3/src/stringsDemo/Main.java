package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);

		
		 System.out.println("Eleman say�s� : " + mesaj.length());
		  
		 System.out.println("5.eleman : " + mesaj.charAt(4)); //n
		  
		 System.out.println("String birle�tirme : " + mesaj.concat(" Ya�as�n!")); //Bug�n hava �ok g�zel. Ya�as�n!
		  
		 System.out.println("String'in neyle ba�lad���n� sorgular : " +
		 mesaj.startsWith("A")); //false
		 System.out.println("String'in neyle bitti�ini sorgular : " +
		 mesaj.startsWith(".")); //false
		  
		 char[] karakterler = new char[5]; 
		 //parantez i�indeki ilk iki de�er karakterleri nerden nerey olan ks�m�n� al�cak diye belirtiyor 
		 //parantez i�indeki 3.de�er hangi diziye atacak onu g�steriyor 
		 //prantez i�indeki 4.de�er atanacak dizinin ka��nc� indisinden ba�layarak atayaca��n� belirtir
		 mesaj.getChars(0, 5, karakterler, 0); 
		 System.out.println(karakterler); //Bug�n
		 
		 //karakter veya string'in ka��nc� indiste oldu�unu belirtiyor
		 System.out.println(mesaj.indexOf('a')); //7
		 System.out.println(mesaj.indexOf("av")); //7
		 
		 //aramaya sa�dan ba�layarak karakter veya string'in ka��nc� indiste oldu�unu belirtiyor 
		 System.out.println(mesaj.lastIndexOf('a')); //9
		 

		// bo�luk olan yerleri tire ile de�i�tiriyoruz
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj); // Bug�n-hava-�ok-g�zel.

		// bu fonksiyon metni nereden kesip ekrana yazd�raca��m�z� g�steriyor
		System.out.println(mesaj.substring(2)); // g�n hava �ok g�zel.

		// bu fonksiyon metni nereden nereye kadar olan k�sm�n� kesip ekrana
		// yazd�raca��m�z� g�steriyor
		System.out.println(mesaj.substring(2, 5)); // g�n
		

		// bu fonksiyon bir metni belli bir karakter veya karakter dizisini dikkate
		// alarak par�alamaya yarar
		// "Bug�n hava �ok g�zel." c�mlesindeki kelimeleri bo�luk karakterleri bularak
		// ay�r�yoruz
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			// Bug�n ekran ��kt�s�
			// hava
			// �ok
			// g�zel.
		}
		

		// Metnin t�m harflerini k���k harfe �eviriyor
		System.out.println(mesaj.toLowerCase()); // bug�n hava �ok g�zel.

		// Metnin t�m harflerini b�y�k harfe �eviriyor
		System.out.println(mesaj.toUpperCase()); // BUG�N HAVA �OK G�ZEL.
		
		//metnin ba��ndaki ve sonundaki bo�luklar� siliyor
		String mesaj2 = "      Bug�n hava �ok g�zel.    ";
		System.out.println(mesaj.trim()); // Bug�n hava �ok g�zel.

	}

}
