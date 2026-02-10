import java.util.Scanner;

public class Tugas2 {
    static Scanner masuk = new Scanner(System.in);
    static String[][] jadwal;
    static int n;

    static void inputData() {
        System.out.print("Jumlah Jadwal : ");
        n = masuk.nextInt();
        masuk.nextLine(); 

        jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Mata Kuliah  : ");
            jadwal[i][0] = masuk.nextLine();
            System.out.print("Ruang        : ");
            jadwal[i][1] = masuk.nextLine();
            System.out.print("Hari         : ");
            jadwal[i][2] = masuk.nextLine();
            System.out.print("Jam          : ");
            jadwal[i][3] = masuk.nextLine();
        }
    }

    static void AllShowing() {
        System.out.println("       DAFTAR JADWAL KULIAH        ");
        System.out.println("===================================");

        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.println("Mata Kuliah : " + jadwal[i][0]);
            System.out.println("Ruang       : " + jadwal[i][1]);
            System.out.println("Hari        : " + jadwal[i][2]);
            System.out.println("Jam         : " + jadwal[i][3]);
            System.out.println("-----------------------------------");
        }
    }

    static void ShowDay() {
        System.out.print("\nMasukkan hari yang dicari = ");
        String hari = masuk.nextLine();
        boolean ketemu = false;

        System.out.println("\nJadwal hari " + hari + " =");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    static void MatkulYeah() {
        System.out.print("\nMasukkan nama mata kuliah = ");
        String mk = masuk.nextLine();
        boolean ketemu = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(
                    "Hari  = " + jadwal[i][2] +
                    ", Jam  = " + jadwal[i][3] +
                    ", Ruang  = " + jadwal[i][1]
                );
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Input Jadwal Kuliah");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("4. Tampilkan Jadwal Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu = ");

            pilihan = masuk.nextInt();
            masuk.nextLine(); 

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    AllShowing();
                    break;
                case 3:
                    ShowDay();
                    break;
                case 4:
                    MatkulYeah();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}
