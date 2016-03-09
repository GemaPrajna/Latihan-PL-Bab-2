package mahasiswalari;

import java.util.*;

public class MainMahasiswaLari {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        MahasiswaLari mhs = new MahasiswaLari();
        MahasiswaLari Jumlah [] = new MahasiswaLari [in2.nextInt()];
        int panjang = in.nextInt();
        int lebar = in.nextInt();
        for (int i = 0; i <Jumlah.length; i++) {
            System.out.println("nama : ");
        mhs.getnama(in.next());
            System.out.println("nim : ");
            mhs.getnim(in.next());
            System.out.println("jumlah putaran : ");
            mhs.getjumlahputaran(in.nextInt());
            System.out.println("jumlah waktu : ");
            mhs.getjumlahwaktu(in.nextInt());
            mhs.displayMessage();
        
        }
    }
}
