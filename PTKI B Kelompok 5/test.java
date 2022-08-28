import java.util.Scanner;

public class test{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan,pilih;
        String nama;
        System.out.print("Masukkan nama :");
        nama = input.next();
        System.out.println("Pilihan: ");
        System.out.println("1. Ayam Bakar(Rp.18.000)\n 2. Kerak Telor(Rp.13.000)\n 3. Ketoprak(Rp.15.000)\n 4. Air putih (Rp.5.000)\n 5. Es teh (Rp.6.000)\n");
        System.out.println();
        System.out.print("Masukkan Pilihan :");
        pilih = input.nextInt();
        System.out.print("Jumlah Pesan : ");
        pesan = input.nextInt();
        System.out.println("================");
        switch(pilih){
            case 1:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Ayam Bakar");
                System.out.println("Harga : 18.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*18000);
            break;
            case 2:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Kerak Telor");
                System.out.println("Harga : 13.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*13000);
            break;
            case 3:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Ketoprak");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*15000);
            break;
            case 4:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : air putih");
                System.out.println("Harga : 5.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*5000);
            break;
            case 5:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Es teh");
                System.out.println("Harga : 6.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*6000);
            break;
            case 6:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Paket Murah 1 ( Ayam Bakar + Air putih");
                System.out.println("Harga : 20.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*20000);
            break;
            case 7:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Paket Murah 2 ( Ketoprak + Air putih");
                System.out.println("Harga : 18.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*18000);
            break;
            case 8:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Paket Murah 3 ( Kerak telor + Air putih");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*15000);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
    }
}