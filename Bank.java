public class Bank {
    private double saldo;
    private String nama;

    // Constructor
    public Bank(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    // Method untuk mengecek saldo
    public void checkSaldo() {
        System.out.println("Saldo anda: " + saldo);
    }

    // Method untuk menyetor uang
    public void setorTunai(double money) {
        saldo += money;
        System.out.println("Setor tunai berhasil");
    }

    // Method untuk menarik uang
    public void withDraw(double money) {
        if (saldo >= money) {
            saldo -= money;
            System.out.println("Penarikan berhasil");
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan");
        }
    }

    // Main method untuk menjalankan program
    public class ClassBank {
    public static void main(String[] args) {
        Bank bank = new Bank("User", 1000);

        bank.checkSaldo();        // Mengecek saldo awal
        bank.withDraw(200);       // Menarik uang sebesar 200
        bank.checkSaldo();        // Mengecek saldo setelah penarikan
        bank.withDraw(3000);      // Mencoba menarik uang sebesar 3000
        bank.setorTunai(5000);    // Menyetor uang sebesar 5000
        bank.checkSaldo();        // Mengecek saldo setelah penyetoran
    }
}
}

