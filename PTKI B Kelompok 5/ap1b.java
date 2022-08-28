// Nama: Ghithrif Aprillio Rakhman (50421556), Rasya Rachman (51421259), Dava Arya (50421337) (1IA16)


import java.util.Scanner;
 
public class ap1b {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan,pilih;
        String nama;
        System.out.print("Masukkan nama :");
        nama = input.next();
        System.out.println("Pilihan: ");
        System.out.println("1. Bakmie(Rp.12.000)\n 2. Nasi Goreng(Rp.15.000)\n 3. Kwetiaw(Rp.15.000)\n 4. Mie Goreng(Rp.15.000)\n 5.Bihun Goreng(Rp.12.000)\n");
        System.out.println();
        System.out.print("Masukkan Pilihan :");
        pilih = input.nextInt();
        System.out.print("Jumlah Pesan : ");
        pesan = input.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Bakmie");
                System.out.println("Harga : 12.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*12000);
            break;
            case 2:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Nasi Goreng");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*15000);
            break;
            case 3:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Kwetiaw");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*15000);
            break;
            case 4:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Mie Goreng");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*15000);
            break;
            case 5:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Bihun Goreng");
                System.out.println("Harga : 12.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*12000);
            break;
            default:
            System.out.println("Selamat Anda Kena Prank! :(");
        }
    }
}