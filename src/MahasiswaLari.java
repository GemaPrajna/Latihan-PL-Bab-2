package mahasiswalari;
//class mahasiswaLari
//object mahasiswaA,B,C
//atribut nim,nama,jumlahputaran,jumlahwaktu
//lapangan (100m x 20m)
//mhsA 3X5menit
//mhsB 7X6menit
//mhsC 5X4menit
//HITUNG WAKTU TERCEPAT DAN JARAK YANG DI TEMPUH PERMAHASISWA
//CARI PEMENANG DENGAN MENCARI WAKTU TERCEPAT DLM 1 PUTARAN
public class MahasiswaLari {
 private double pemenang,jumlahputaran,jumlahwaktu,jaraktempuh,waktu1putaran;
private int Keliling,panjang,lebar;
 private String nim;
 private String nama;


final int panjang(int panjang){
   this.panjang = panjang;
   return panjang;
}
final int lebar (int lebar){
    this.lebar=lebar;
    return lebar;
}
  public void getnama (String nama){ 
     this.nama = nama;
  }
 public void getnim (String nim){
     this.nim = nim;
 }
 int getKeliling (){
   return Keliling = (2*this.panjang)+(2*this.lebar) ;
 }
 public void getjumlahputaran (double A){
      jumlahputaran = A;
 }
 public void getjumlahwaktu (double B){
      jumlahwaktu = B;
 }
 public double setJarakTempuh (){
     jaraktempuh = Keliling*jumlahputaran;
     return jaraktempuh ;
 }
 public double Waktu1Putaran(){
     waktu1putaran = jumlahwaktu/jumlahputaran;
     return waktu1putaran;
 }
 public void pemenang (){
     pemenang = jaraktempuh/jumlahwaktu;
 
 }
 public void displayMessage(){
     System.out.println(""+nama);
     System.out.println(""+nim);
     System.out.println(""+jaraktempuh);
     System.out.println(""+waktu1putaran);
     System.out.println(pemenang);
 }

    }

 

    
 

