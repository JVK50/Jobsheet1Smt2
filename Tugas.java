import java.util.Scanner;

public class Tugas {
      public static void main(String[] args) {
        Scanner platKota = new Scanner(System.in);
        char[] c0de = {'A','B','D','E','F','G','H','L','N','T'};
        String[][] kota = {
            {"Banten"}, {"Jakarta"}, {"Bandung"}, {"Cirebon"},
            {"Bogor"}, {"Pekalongan"}, {"Semarang"}, {"Surabaya"}, {"Malang"},
            {"Tegal"}, 
        };
        System.out.print("Masukkan kode plat = ");
        char platCode = Character.toUpperCase(platKota.next().charAt(0));
        boolean found = false;
        for (int i = 0; i < c0de.length; i++) {
            if (c0de[i] == platCode) {
                System.out.println("Kota = " + kota[i][0]);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Kode tidak ditemukan!");
        platKota.close();
    }
}
