import java.util.Scanner;

public class javaArray {
    public static void main(String[] args) {
       Scanner sikma = new Scanner(System.in);
        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        int[] sks = {2, 3, 3, 3, 2, 3, 1, 2};
        double[] Angka = new double[mk.length];
        String[] Huruf = new String[mk.length];
        double[] Bobot = new double[mk.length];

        System.out.println("*******************************");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("********************************");
        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            Angka[i] = sikma.nextDouble();
        }

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.printf("%-40s %-15s %-15s %-15s%n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totalBobot = 0;
        int totalSKS = 0;
        for (int i = 0; i < mk.length; i++) {
            if (Angka[i] >= 85) {
                Huruf[i] = "A";
                Bobot[i] = 4.00;
            } 
            else if (Angka[i] >= 80) {
                Huruf[i] = "B+";
                Bobot[i] = 3.50;
            } 
            else if (Angka[i] >= 70) {
                Huruf[i] = "B";
                Bobot[i] = 3.00;
            } 
            else if (Angka[i] >= 65) {
                Huruf[i] = "C+";
                Bobot[i] = 2.50;
            } 
            else if (Angka[i] >= 60) {
                Huruf[i] = "C";
                Bobot[i] = 2.00;
            } 
            else if (Angka[i] >= 50) {
                Huruf[i] = "D";
                Bobot[i] = 1.00;
            } 
            else {
                Huruf[i] = "E";
                Bobot[i] = 0.00;
            }

            totalBobot += Bobot[i] * sks[i];
            totalSKS += sks[i];

            System.out.printf("%-40s %-15.2f %-15s %-15.2f%n",
                    mk[i], Angka[i], Huruf[i], Bobot[i]);
        }

        double ip = totalBobot / totalSKS;
        System.out.printf("\nIP : %.2f%n", ip);

        sikma.close();
    }
}