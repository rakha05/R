import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.xml.crypto.Data;

public class daftarbuku2 {
    
    String judul;
    String author;
    String penerbit;
    String kategori;
    String tahun;

    daftarbuku2(String judul, String author, String penerbit, String kategori, String tahun) {
        this.judul = judul;
        this.author = author;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.tahun = tahun;
    
    } 
        

    public static void main(String[] args) { 

         System.out.println("========================================================");
         System.out.println(" Daftar Buku yang Tersedia ");
         System.out.println("========================================================");
 

        ArrayList<daftarbuku2> daftarbuku = new ArrayList<daftarbuku2>();
        daftarbuku.add(new daftarbuku2(" Milea               ", " Pidi Baiq ", " Pastel ",    "   Fiksi ",    "   2018" ));
        daftarbuku.add(new daftarbuku2(" Dasar Pemrograman ", " Abdul Kadir ", " Erlangga ", " Teknik ", "   2008 "));
        daftarbuku.add(new daftarbuku2(" Manajemen Produksi ", " Daryanto ", " Yrama Widya ", "Manajemen ", "2021 "));
        daftarbuku.add(new daftarbuku2(" Hidrologi            ", " Suwignyo ", " UMM Press ",  "Teknik " , "  2022 " ));
        daftarbuku.add(new daftarbuku2(" Mariposa             ", " Luluk HF ", " Coconut ",   "   Fiksi " ,   "  2020"));
        System.out.println("Judul                             " + "Author       " + "Penerbit" + " Kategori" + "Tahun " );
        System.out.println("===============================================================================================================");

        for(daftarbuku2 item : daftarbuku) {

            System.out.println(item.judul + item.author + item.penerbit + item.kategori + item.tahun); 
        }
        Stack<daftarbuku2> stack = new Stack<>();
        stack.push(Data.get(0));

        for (int i = 1; i < Data.size(); i++) {
            stack.push(Data.get(i));
            daftarbuku2 item = stack.pop();
            int bukuBaru = 0;
            int bukuLawas = 0;
            
            if (bukuBaru > 2000) {
                bukuLawas++;
            } else {
                bukuBaru++;
            }
            System.out.println("=========================================================");
            System.out.println("Jumlah buku yang tersedia : "+daftarbuku.size());
    
            System.out.println("Buku Lawas: " + bukuLawas);
            System.out.println("Buku Baru: " + bukuBaru); {
                System.out.close();
            }
            }
            }
        
    }
