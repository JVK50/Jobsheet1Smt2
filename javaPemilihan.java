import java.util.Scanner;

public class javaPemilihan {
    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        int tugas = jvk.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int kuis = jvk.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int uts = jvk.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int uas = jvk.nextInt();
      
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai akhir tidak valid.");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Huruf: A");
                System.out.println("Keterangan: Lulus");
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Huruf: B+");
                System.out.println("Keterangan: Lulus");
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Huruf: B");
                System.out.println("Keterangan: Lulus");
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Huruf: C+");
                System.out.println("Keterangan: Lulus");
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Huruf: C");
                System.out.println("Keterangan: Lulus");
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Huruf: D");
                System.out.println("Keterangan: Tidak Lulus");
            } else {
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Nilai Huruf: E");
                System.out.println("Keterangan: Tidak Lulus");
            }   
        }
        jvk.close();
    }
}
