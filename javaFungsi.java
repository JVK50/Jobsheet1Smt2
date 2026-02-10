public class javaFungsi {
    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    public static void main(String[] args) {
        Pendapatan();
    }

    static int[] harga = {75000, 50000, 60000, 10000};
    static void Pendapatan() {
        for (int i = 0; i < stock.length; i++) {
            int total = 0;
            for (int j = 0; j < stock[i].length; j++) {
                total += stock[i][j] * harga[j];
            }

            String status;
            if (total > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }
            System.out.println("Royal Garden Cabang " + (i + 1));
            System.out.println("Pendapatan = Rp" + total);
            System.out.println("Status     = " + status + "\n");

        }
    }
}
