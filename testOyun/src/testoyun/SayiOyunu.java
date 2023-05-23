
package testoyun;
import java.util.Scanner;

public class SayiOyunu {
       
    
    int bulanacakSayi ;
        int girilenSayi;
        boolean  sayiBulundu;
    
        
  //  1.metot // girilen sayi ile bulunacak sayi karşılaştırılacak
    private void buyukKucukGöster(){
    if(girilenSayi>bulanacakSayi){
        System.out.println("girdiginiz  sayi buyuk daha kucuk bir sayi giriniz :/");
    
    }else if(girilenSayi<bulanacakSayi){
         System.out.println("girdiginiz  sayi kucuk daha buyuk bir sayi giriniz :/");
      
       
    }else {System.out.println("!!! TEBRIKLER    sayi bulundu  TEBRIKLER !!!");
    sayiBulundu=true;}
    
    }
  //2. metot // dışarıdaki main metotun erişebileceği ilk metot olacak
    public void oyunSorusu(){
    String cevap;
    Scanner klavye =new Scanner(System.in);
    do{
    oyunOyna();
        System.out.println("bir daha oynamka istermisiniz   (evet) (hayır) ?");
    cevap=klavye.next();
    
    }while(cevap.equalsIgnoreCase("evet"));
        System.out.println(".:.  iyi günler  .:.");
    
    
    
    }
        // 3.metot // sayi üretmek için
    private void oyunaBasla(){
    bulanacakSayi=(int)( Math.random()*100+1 );
    sayiBulundu=false;
    
    
    }
        // 4.metot 1 ile 100 arasındamı 
    private void sayiSor(){
    Scanner klavye2=new Scanner(System.in);
    do{
        System.out.println("1 ile 100 arasi bir sayi giriniz");
    girilenSayi=klavye2.nextInt();
    }while( (girilenSayi<1) &&  (girilenSayi>100) );
        
    
    
    }
      //5 .metot rasthele   hepsinin birleştirmsi
    private void oyunOyna(){
        //System.out.println("CAN :100 ADİM SAYİSİ 0");
         System.out.println("");
        
        oyunaBasla();
    
    do{
    sayiSor();
    buyukKucukGöster();
    
    }while(!(sayiBulundu ));
    
    
    }
    
    
    
}
