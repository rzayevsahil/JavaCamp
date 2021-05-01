package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		
		 System.out.println("Eleman sayýsý : " + mesaj.length());
		  
		 System.out.println("5.eleman : " + mesaj.charAt(4)); //n
		  
		 System.out.println("String birleþtirme : " + mesaj.concat(" Yaþasýn!")); //Bugün hava çok güzel. Yaþasýn!
		  
		 System.out.println("String'in neyle baþladýðýný sorgular : " +
		 mesaj.startsWith("A")); //false
		 System.out.println("String'in neyle bittiðini sorgular : " +
		 mesaj.startsWith(".")); //false
		  
		 char[] karakterler = new char[5]; 
		 //parantez içindeki ilk iki deðer karakterleri nerden nerey olan ksýmýný alýcak diye belirtiyor 
		 //parantez içindeki 3.deðer hangi diziye atacak onu gösteriyor 
		 //prantez içindeki 4.deðer atanacak dizinin kaçýncý indisinden baþlayarak atayacaðýný belirtir
		 mesaj.getChars(0, 5, karakterler, 0); 
		 System.out.println(karakterler); //Bugün
		 
		 //karakter veya string'in kaçýncý indiste olduðunu belirtiyor
		 System.out.println(mesaj.indexOf('a')); //7
		 System.out.println(mesaj.indexOf("av")); //7
		 
		 //aramaya saðdan baþlayarak karakter veya string'in kaçýncý indiste olduðunu belirtiyor 
		 System.out.println(mesaj.lastIndexOf('a')); //9
		 

		// boþluk olan yerleri tire ile deðiþtiriyoruz
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj); // Bugün-hava-çok-güzel.

		// bu fonksiyon metni nereden kesip ekrana yazdýracaðýmýzý gösteriyor
		System.out.println(mesaj.substring(2)); // gün hava çok güzel.

		// bu fonksiyon metni nereden nereye kadar olan kýsmýný kesip ekrana
		// yazdýracaðýmýzý gösteriyor
		System.out.println(mesaj.substring(2, 5)); // gün
		

		// bu fonksiyon bir metni belli bir karakter veya karakter dizisini dikkate
		// alarak parçalamaya yarar
		// "Bugün hava çok güzel." cümlesindeki kelimeleri boþluk karakterleri bularak
		// ayýrýyoruz
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			// Bugün ekran çýktýsý
			// hava
			// çok
			// güzel.
		}
		

		// Metnin tüm harflerini küçük harfe çeviriyor
		System.out.println(mesaj.toLowerCase()); // bugün hava çok güzel.

		// Metnin tüm harflerini büyük harfe çeviriyor
		System.out.println(mesaj.toUpperCase()); // BUGÜN HAVA ÇOK GÜZEL.
		
		//metnin baþýndaki ve sonundaki boþluklarý siliyor
		String mesaj2 = "      Bugün hava çok güzel.    ";
		System.out.println(mesaj.trim()); // Bugün hava çok güzel.

	}

}
